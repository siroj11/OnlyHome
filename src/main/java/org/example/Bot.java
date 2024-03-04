package org.example;

import homeAppliances.Fridges;
import lombok.SneakyThrows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ActionType;
import org.telegram.telegrambots.meta.api.methods.send.SendChatAction;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bot extends TelegramLongPollingBot {
    Service service = new Service();
    String product = null;
    private Map<Integer, String> userSelectedProducts = new HashMap<>();
    private Map<Long, ShoppingCart> userShoppingCarts = new HashMap<>();
    static List<Users> userList = new ArrayList<>();
    homeAppliances.Fridges fridges = new Fridges();
    SendChatAction action = new SendChatAction();
    private String state = "";

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            Message chatMessage = update.getMessage();
            Long userId = chatMessage.getFrom().getId();
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();
            switch (text) {
                case "/start" -> {
                    String user_first_name = update.getMessage().getChat().getFirstName();
                    String user_last_name = update.getMessage().getChat().getLastName();
                    String user_username = update.getMessage().getChat().getUserName();
                    String chatID = String.valueOf(update.getMessage().getChatId());
                    userList.add(new Users(user_first_name, user_last_name, user_username, text, chatID));
                    try {
                        startMessages(chatID);
                    } catch (TelegramApiException | IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "\uD83D\uDCCBSavat" -> {
                    if (product.isEmpty()) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText("Sizning savatingiz bo'sh");
                        try {
                            execute(message);
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        sendCartContents(userId);
                    }
                }
                case "⬅️Back" -> {
                    switch (state) {
                        case "order" -> {
                            try {
                                execute(service.menu(chatId));
                            } catch (TelegramApiException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        case "catalogFirstPage" -> {
                            try {
                                execute(service.order(chatId));
                                state = "order";
                            } catch (TelegramApiException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        case "maishiyTexnika" -> {
                            try {
                                state = "catalogFirstPage";
                                execute(service.maishiyTexnika(chatId));
                            } catch (TelegramApiException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        case "fridge" -> {
                            try {
                                state = "maishiyTexnika";
                                execute(service.fridge(chatId));
                            } catch (TelegramApiException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
                case "\uD83C\uDF89 Sale" -> {
                    try {
                        execute(service.sale(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "🛍 Buyurtma" -> {
                    try {
                        state = "order";
                        execute(service.order(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "\uD83D\uDCCB Savat" -> {

                }
                case "✍️ Izoh qoldirish" -> {
                    try {
                        state = "order";
                        execute(service.izohQoldirishUz(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "ℹ️ Biz haqimizda" -> {
                    try {
                        execute(service.aboutUs(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "⚙️ Sozlarmalar" -> {
                    try {
                        execute(service.settings(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Qurilish mollari" -> {
                    try {
                        state = "catalogFirstPage";
                        execute(service.qurilishMollari(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Qurilish jihozlari" -> {
                    try {
                        state = "catalogFirstPage";
                        execute(service.qurilishJihozlari(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Uy jihozlari" -> {
                    try {
                        state = "catalogFirstPage";
                        execute(service.uyJihoz(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Maishiy texnikalar" -> {
                    try {
                        state = "catalogFirstPage";
                        execute(service.maishiyTexnika(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Oshxona jihozlari" -> {
                    try {
                        state = "catalogFirstPage";
                        execute(service.oshxonaJihoz(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Suvinerlar" -> {
                    try {
                        state = "catalogFirstPage";
                        execute(service.suviner(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich" -> {
                    try {
                        state = "maishiyTexnika";
                        execute(service.fridge(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "LG muzlatgichlar" -> {
                    try {
                        state = "fridge";
                        execute(fridges.LGfridge(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgichlar Samsung" -> {
                    state = "fridge";
                    execute(fridges.SamsungFridge(chatId));
                }
                case "Haier muzlatgichlar" -> {
                    state = "fridge";
                    execute(fridges.HaierFridge(chatId));
                }
                case "HANSA muzlatgichlar" -> {
                    state = "fridge";
                    execute(fridges.HansaFridge(chatId));
                }
                case "Beko muzlatgichlar" -> {
                    state = "fridge";
                    execute(fridges.BekoFridge(chatId));
                }
                case "Artel muzlatgichlar" -> {
                    state = "fridge";
                    execute(fridges.ArtelFridge(chatId));
                }
                case "Muzlatgich LG 187l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.LG187l(chatId));
                    execute(fridges.LG187l_info(chatId));

                }
                case "Muzlatgich LG 254l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    try {

                        execute(action);
                        execute(fridges.LG254l(chatId));
                        execute(fridges.LG254l_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich LG 306l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    try {

                        execute(action);
                        execute(fridges.LG306l(chatId));
                        execute(fridges.LG306l_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich LG 341l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    try {

                        execute(action);
                        execute(fridges.LG341l(chatId));
                        execute(fridges.LG341l_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich LG 395l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    try {

                        execute(action);
                        execute(fridges.LG395l(chatId));
                        execute(fridges.LG395l_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich LG 617l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    try {

                        execute(action);
                        execute(fridges.LG617l(chatId));
                        execute(fridges.LG617l_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich Samsung 290l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    try {

                        execute(action);
                        execute(fridges.SM290l(chatId));
                        execute(fridges.SM290l_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich Samsung 310l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    try {

                        execute(action);
                        execute(fridges.SM310l(chatId));
                        execute(fridges.SM310l_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich Samsung 367l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    try {

                        execute(action);
                        execute(fridges.SM367l(chatId));
                        execute(fridges.SM367l_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich Samsung 388l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    try {

                        execute(action);
                        execute(fridges.SM388l(chatId));
                        execute(fridges.SM388l_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich Samsung 460l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    try {
                        execute(action);
                        execute(fridges.SM460l(chatId));
                        execute(fridges.SM460l_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich Samsung 640l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    try {

                        execute(action);
                        execute(fridges.SM640l(chatId));
                        execute(fridges.SM640l_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich Haier 364l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.HR364l(chatId));
                    execute(fridges.HR364_info(chatId));
                }
                case "Muzlatgich Haier 346l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.HR346l(chatId));
                    execute(fridges.HR346l_info(chatId));
                }
                case "Muzlatgich Haier 400l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.HR400l(chatId));
                    execute(fridges.HR400_info(chatId));
                }
                case "Muzlatgich Hansa 242l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.HS242l(chatId));
                    execute(fridges.HS242_info(chatId));
                }
                case "Muzlatgich Hansa 351l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.HS351l(chatId));
                    execute(fridges.HS351_info(chatId));
                }
                case "Muzlatgich Hansa 256l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.HS256l(chatId));
                    execute(fridges.HS256l_info(chatId));
                }
                case "Muzlatgich Hansa 341l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.HS341l(chatId));
                    execute(fridges.HS341_info(chatId));
                }
                case "Muzlatgich Beko 223l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.BK223l(chatId));
                    execute(fridges.BK223l_info(chatId));
                }
                case "Muzlatgich Beko 280l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.BK280l(chatId));
                    execute(fridges.BK280l_info(chatId));
                }
                case "Muzlatgich Beko 215l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.BK215l(chatId));
                    execute(fridges.BK215_info(chatId));
                }
                case "Muzlatgich Artel 175l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.AR175l(chatId));
                    execute(fridges.AR175_info(chatId));
                }
                case "Muzlatgich Artel 225l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.AR225l(chatId));
                    execute(fridges.AR225_info(chatId));
                }
                case "Muzlatgich Artel 212l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.AR212l(chatId));
                    execute(fridges.AR212_info(chatId));
                }
                case "Muzlatgich Artel 265l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.AR265l(chatId));
                    execute(fridges.AR265_info(chatId));
                }
                case "Muzlatgich Artel 350l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.AR350l(chatId));
                    execute(fridges.AR350_info(chatId));
                }
                case "Muzlatgich Artel 380l" -> {
                    action.setAction(ActionType.UPLOADPHOTO);
                    action.setChatId(chatId);
                    execute(action);
                    execute(fridges.AR380l(chatId));
                }
            }
        }
        if (update.hasMessage() && update.getMessage().hasContact()) {
            SendMessage sendMessage = new SendMessage();
            Long chatId = update.getMessage().getChatId();
            String phoneNumber = update.getMessage().getContact().getPhoneNumber();
            String name = update.getMessage().getFrom().getFirstName();
            System.out.println(name + "\n" + phoneNumber);
            sendMessage.setChatId(chatId);
            sendMessage.setText("Siz royxatdan otdingiz");
            try {
                execute(sendMessage);
                execute(service.menu(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }


        if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            long chatid = callbackQuery.getMessage().getChatId();
            switch (data) {
                /*case "eng" -> {
                    try {
                        execute(service.menu(chatid));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "rus" -> {
                    try {
                        execute(service.menu(chatid));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }*/
                case "uzb" -> {
                    try {
                        if (firstStart) {
                            execute(service.contactRequest(chatid));
                            firstStart = false;
                        } else if (firstStart) {
                            execute(service.menu(chatid));
                        }
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "LG187l_ID" -> {
                    product = ("Muzlatgich LG187l");
                    cost += 6500000;
                    addToCart(chatid, product, cost);
                }
                case "LG254l_ID" -> {
                    product = ("Muzlatgich LG254l");
                    cost += 7400000;
                    addToCart(chatid, product, cost);
                }
                case "LG306l_ID" -> {
                    product = ("Muzlatgich LG306l");
                    cost += 8000000;
                    addToCart(chatid, product, cost);
                }
                case "LG341l_ID" -> {
                    product = ("Muzlatgich LG341l");
                    cost += 9000000;
                    addToCart(chatid, product, cost);
                }
                case "LG35l_ID" -> {
                    product = ("Muzlatgich LG35l");
                    cost += 10000000;
                    addToCart(chatid, product, cost);
                }
                case "LG617l_ID" -> {
                    product = ("Muzlatgich LG617l");
                    cost += 20000000;
                    addToCart(chatid, product, cost);
                }
                case "acceptCart" -> {
                    CallbackQuery Query = update.getCallbackQuery();
                    String text = Query.getMessage().getText();
                    buy( chatid);
                }
                case "editLanguageID" -> execute(service.choiceLanguage(chatid));
            }
        }

    }


    private void sendCartContents(Long userId) {
        ShoppingCart cart = userShoppingCarts.getOrDefault(userId, new ShoppingCart());
        Map<String, Long> contents = cart.getContents();

        StringBuilder sb = new StringBuilder("Sizning buyurtmalaringiz:\n");
        for (Map.Entry<String, Long> entry : contents.entrySet()) {
            sb.append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
        }

        SendMessage message = new SendMessage();
        message.setChatId(userId.toString());
        message.setText(sb.toString());
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Buyurtmani tasdiqlash");
        button1.setCallbackData("acceptCart");
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Buyurtmani davom etirish");
        button2.setCallbackData("continue");
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("\uD83D\uDD04Tozalash");
        button3.setCallbackData("clean");
        row1.add(button1);
        row2.add(button2);
        row3.add(button3);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void addToCart(Long userId, String productName, long price) {
        ShoppingCart cart = userShoppingCarts.getOrDefault(userId, new ShoppingCart());
        cart.addProduct(productName, price);
        userShoppingCarts.put(userId, cart);
        SendMessage successMessage = new SendMessage();
        successMessage.setChatId(userId.toString());
        successMessage.setText("Tovar: '" + productName + " savatga qoshildi");
        try {
            execute(successMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void buy(Long chatId) throws TelegramApiException {
        ShoppingCart cart = userShoppingCarts.getOrDefault(chatId, new ShoppingCart());
        Map<String, Long> contents = cart.getContents();

        StringBuilder sb = new StringBuilder("Sizning buyurtmalaringiz:\n");
        for (Map.Entry<String, Long> entry : contents.entrySet()) {
            sb.append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
        }
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(sb.toString());
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setCallbackData("cashId");
        button1.setText("Naqd pul");
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Click");
        button2.setCallbackData("clickId");
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Payme");
        button3.setCallbackData("paymeId");
        row1.add(button1);
        row1.add(button2);
        row2.add(button3);
        rowList.add(row1);
        rowList.add(row2);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        execute(message);
    }

    private void startMessages(String chatid) throws TelegramApiException, IOException {
        if (firstStart) {
            dataCheck();
            SendMessage message = new SendMessage();
            message.setText("OnlyHome botiga xush kelibsiz");
            message.setChatId(chatid);
            execute(message);
            execute(service.choiceLanguage(Long.parseLong(chatid)));
        } else {
            execute(service.menu(Long.parseLong(chatid)));
        }

    }

    private void dataCheck() {
        XSSFWorkbook sheets = new XSSFWorkbook();
        XSSFSheet sheet = sheets.createSheet("User");
        XSSFCellStyle cellStyle = sheets.createCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = row.createCell(0, Cell.CELL_TYPE_STRING);
        cell.setCellValue("FirstName");
        cell.setCellStyle(cellStyle);
        XSSFCell cell1 = row.createCell(0, Cell.CELL_TYPE_STRING);
        cell1.setCellValue("LastName");
        cell1.setCellStyle(cellStyle);
        XSSFCell cell2 = row.createCell(0, Cell.CELL_TYPE_STRING);
        cell2.setCellValue("UserName");
        cell2.setCellStyle(cellStyle);
        XSSFCell cell3 = row.createCell(0, Cell.CELL_TYPE_STRING);
        cell3.setCellValue("ChatId");
        cell3.setCellStyle(cellStyle);

        XSSFCell cell4 = row.createCell(0, Cell.CELL_TYPE_STRING);
        cell4.setCellValue("Text");
        cell4.setCellStyle(cellStyle);

        int i = 1;

        for (Users use : userList) {
            XSSFRow row1 = sheet.createRow(i++);
            row1.createCell(0, Cell.CELL_TYPE_STRING).setCellValue(use.getFirstName());
            row1.createCell(1, Cell.CELL_TYPE_STRING).setCellValue(use.getLastName());
            row1.createCell(2, Cell.CELL_TYPE_STRING).setCellValue(use.getUserName());
            row1.createCell(3, Cell.CELL_TYPE_STRING).setCellValue(use.getMessage());
            row1.createCell(4, Cell.CELL_TYPE_STRING).setCellValue(use.getChatID());
        }
        try {
            sheets.write(new FileOutputStream("C:\\Users\\user\\Desktop\\study\\check.xlsx"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    long cost = 0;
    private boolean firstStart = true;

    @Override
    public String getBotToken() {
        return "6401405008:AAFBkmT05-Q3NWhu2QKDMl8HXk8p8y5u-K8";
    }

    @Override
    public String getBotUsername() {
        return "Only Home";
    }
}
