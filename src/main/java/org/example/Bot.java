package org.example;

import homeAppliances.LGfridges;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMediaGroup;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.media.InputMedia;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaPhoto;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bot extends TelegramLongPollingBot {
    Service service = new Service();
    static List<Users> userList = new ArrayList<>();
    homeAppliances.LGfridges LGfridges = new LGfridges();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
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
                        try {
                            execute(service.basket(chatId, cost, product));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
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
                        execute(service.order(chatId));

                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "\uD83D\uDCCB Savat" -> {
                }
                case "✍️ Izoh qoldirish" -> {
                    break;
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
                        execute(service.qurilishMollari(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Qurilish jihozlari" -> {
                    try {
                        execute(service.qurilishJihozlari(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Uy jihozlari" -> {
                    try {
                        execute(service.uyJihoz(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Maishiy texnikalar" -> {
                    try {
                        execute(service.maishiyTexnika(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Oshxona jihozlari" -> {
                    try {
                        execute(service.oshxonaJihoz(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Suvinerlar" -> {
                    try {
                        execute(service.suviner(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich" -> {
                    try {
                        execute(service.fridge(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "LG muzlatgichlar" -> {
                    try {
                        execute(LGfridges.LGfridge(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich LG GN B272SLCB" -> {
                    try {
                        execute(LGfridges.LGgnB272SLCB(chatId));
                        execute(LGfridges.LGgnB272SLCB_INFO(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlkatgich LG GN-F272SBCB.ABLQTAS" -> {
                    try {
                        execute(LGfridges.LGGNF272SBCB(chatId));
                        execute(LGfridges.LGGNF272SBCB_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich LG GC B399SMCL" -> {
                    try {
                        execute(LGfridges.LGGCB399SMCL(chatId));
                        execute(LGfridges.LGGCB399SMCL_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich LG GC B459SLCL" -> {
                    try {
                        execute(LGfridges.LGGCB459SLCL(chatId));
                        execute(LGfridges.LGGCB459SLCL_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich LG GN-B392SMBB.APZQCIS" -> {
                    try {
                        execute(LGfridges.LGGNB392SMBB(chatId));
                        execute(LGfridges.LGGNB392SMBB_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Muzlatgich LG GC X257CAEC" -> {
                    try {
                        execute(LGfridges.LGGCX257CAEC(chatId));
                        execute(LGfridges.LGGCX257CAEC_info(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
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
                        execute(service.contactRequest(chatid));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "LGgnB272SLCB_ID" -> {
                    product.add("LGgnB272SLCB");
                    cost += 6500000;
                    try {
                        execute(messageOrder(chatid));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "LGGNF272SBCB_ID" -> {
                    product.add("LGGNF272SBCB");
                    cost += 7400000;
                    try {
                        execute(messageOrder(chatid));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "LGGCB399SMCL_ID" -> {
                    product.add("LGGCB399SMCL");
                    cost += 8000000;
                    try {
                        execute(messageOrder(chatid));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "LGGCB459SLCL_ID" -> {
                    product.add("LGGCB459SLCL");
                    cost += 9000000;
                    try {
                        execute(messageOrder(chatid));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "LGGNB392SMBB_ID" -> {
                    product.add("LGGNB392SMBB");
                    cost += 10000000;
                    try {
                        execute(messageOrder(chatid));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "LGGCX257CAEC_ID" -> {
                    product.add("LGGCX257CAEC");
                    cost += 20000000;
                    try {
                        execute(messageOrder(chatid));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }

    public SendMessage messageOrder(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("Tovaringiz savatga qoshildi");
        message.setChatId(chatId);
        return message;
    }

    private void startMessages(String chatid) throws TelegramApiException, IOException {
        if (firstStart) {
            dataCheck();
            SendMessage message = new SendMessage();
            message.setText("OnlyHome botiga xush kelibsiz");
            message.setChatId(chatid);
            execute(message);
            if (true) execute(service.choiceLanguage(Long.parseLong(chatid)));
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
            row1.createCell(5, Cell.CELL_TYPE_STRING).setCellValue(use.getChatID());
        }
        try {
            sheets.write(new FileOutputStream(new File("C:\\Users\\user\\Desktop\\study\\check.xlsx")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    HashMap<Integer, Integer> checkMap = new HashMap<>(5);
    HashMap<Integer, Object[]> stringMap = new HashMap<>();

    long cost = 0;
    private List<String> product = new ArrayList<>();
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
