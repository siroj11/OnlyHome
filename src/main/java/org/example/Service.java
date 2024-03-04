package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Service {
    public SendMessage choiceLanguage(long chatid) {
        SendMessage message = new SendMessage();
        message.setChatId(chatid);
        message.setText("""
                Tilni tanlang:\s
                Выберите язык:\s
                Select language""");
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("\uD83C\uDDFA\uD83C\uDDFFO'zbekcha");
        button1.setCallbackData("uzb");
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("\uD83C\uDDF7\uD83C\uDDFAРусский");
        button2.setCallbackData("rus");
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("\uD83C\uDDFA\uD83C\uDDF8English");
        button3.setCallbackData("eng");

        row1.add(button1);
        row2.add(button2);
        row3.add(button3);
        rowlist.add(row1);
        rowlist.add(row2);
        rowlist.add(row3);
        markup.setKeyboard(rowlist);
        message.setReplyMarkup(markup);
        return message;
    }


    public SendMessage menu(long chatid) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatid);
        sendMessage.setText("""
                Buyurtma berish uchun Buyurtma tugmasini bosing
                          
                 """);
        sendMessage.enableMarkdown(true);
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("🛍 Buyurtma");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDCCB Savat");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("✍️ Izoh qoldirish");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("ℹ️ Biz haqimizda");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("⚙️ Sozlarmalar");
        row1.add(button1);
        row2.add(button2);
        row2.add(button3);
        row3.add(button4);
        row3.add(button5);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        reply.setKeyboard(rowList);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }


    public SendMessage qurilishMollari(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Kategoriyani tanlang");
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();
        button.setText("⬅️Back");
        row.add(button);
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Sement");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Qum");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Sheben");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Tosh");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Taxta");
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);
        row2.add(button3);
        row2.add(button4);
        row3.add(button5);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row);
        markup.setResizeKeyboard(true);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMessage qurilishJihozlari(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("");
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton back = new KeyboardButton();
        back.setText("⬅️Back");
        row.add(back);
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("");
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("");
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("");
        row1.add(button1);
        row1.add(button2);
        row2.add(button3);
        row2.add(button4);
        row3.add(button5);
        row3.add(button6);
        row4.add(button7);
        row4.add(button8);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row);
        return message;
    }

    public SendMessage uyJihoz(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("");
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton back = new KeyboardButton();
        back.setText("⬅️Back");
        row.add(back);
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("");
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("");
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("");
        row1.add(button1);
        row1.add(button2);
        row2.add(button3);
        row2.add(button4);
        row3.add(button5);
        row3.add(button6);
        row4.add(button7);
        row4.add(button8);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row);
        return message;
    }

    public SendMessage maishiyTexnika(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Katologni tanlang");
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton back = new KeyboardButton();
        back.setText("⬅️Back");
        row.add(back);
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Muzlatgich");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Kir Yuvish Mashinasi");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Gaz plita");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Mikrovalnofka");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Elektron pech");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Changyutgich");
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Konditsioner");
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Kuler");
        row1.add(button1);
        row1.add(button2);
        row2.add(button3);
        row2.add(button4);
        row3.add(button5);
        row3.add(button6);
        row4.add(button7);
        row4.add(button8);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row);
        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMessage oshxonaJihoz(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("");
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton back = new KeyboardButton();
        back.setText("⬅️Back");
        row.add(back);
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Rakovina");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Kran");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Suv filtri");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("");
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("");
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("");
        row1.add(button1);
        row1.add(button2);
        row2.add(button3);
        row2.add(button4);
        row3.add(button5);
        row3.add(button6);
        row4.add(button7);
        row4.add(button8);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row);
        return message;
    }

    public SendMessage suviner(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("");
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton back = new KeyboardButton();
        back.setText("⬅️Back");
        row.add(back);
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("");
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("");
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("");
        row1.add(button1);
        row1.add(button2);
        row2.add(button3);
        row2.add(button4);
        row3.add(button5);
        row3.add(button6);
        row4.add(button7);
        row4.add(button8);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row);
        return message;
    }

    public SendMessage fridge(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Katalogni tanlang");
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton back = new KeyboardButton();
        back.setText("⬅️Back");
        row.add(back);
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("LG muzlatgichlar");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Muzlatgichlar Samsung");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Haier muzlatgichlar");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("HANSA muzlatgichlar");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Beko muzlatgichlar");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Artel muzlatgichlar");
        row1.add(button1);
        row1.add(button2);
        row2.add(button3);
        row2.add(button4);
        row3.add(button5);
        row3.add(button6);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row);
        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMessage basket(Long chatId, long cost, List<String> product) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        String text = "";
        for (String s : product) {
            text = "Sizning tovarlaringiz: \n" + s + "\nNarxi: " + cost;
        }
        message.setText(text);

        return message;
    }

    public SendMessage izohQoldirishUz(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Izoh qoldiring. Sizning fikringiz biz uchun muhim");
        sendMessage.setChatId(chatId);
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅️Orqaga");
        row1.add(button1);
        rows.add(row1);
        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }

    public SendMessage order(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Kategoriyani tanlang");
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();
        button.setText("⬅️Back");
        row.add(button);
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Qurilish mollari");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Qurilish jihozlari");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Uy jihozlari");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Maishiy texnikalar");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Oshxona jihozlari");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Suvinerlar");
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);
        row2.add(button3);
        row2.add(button4);
        row3.add(button5);
        row3.add(button6);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row);
        markup.setResizeKeyboard(true);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMessage contactRequest(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCDE Ro'yxatdan o'tish uchun telefon raqamingizni kiriting. \n" +
                " \n" +
                " Raqamni +998********* shaklida yuboring.");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();

        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setRequestContact(true);
        button1.setText("☎️ Telefon raqamni yuborish");
        row1.add(button1);
        rows.add(row1);
        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }

    public SendPhoto aboutUs(Long chatId) {
        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setCaption("☎️ Call center +998 93 561 71 11");
        photo.setPhoto(new InputFile(new File("D:\\bot\\Only Home.jpg")));
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        button.setText("⬅️Back");
        KeyboardRow row = new KeyboardRow();
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        photo.setReplyMarkup(markup);
        return photo;
    }

    public SendMessage settings(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Kerakli bo'limni tanlang");
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button1.setText("Tilni ozgartirish");
        button1.setCallbackData("editLanguageID");
        button2.setText("Yangi raqam qoshish");
        button2.setCallbackData("editContactID");
        row1.add(button1);
        row1.add(button2);
        rowList.add(row1);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMessage editContact(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("""
                Input new phone number\s

                 Enter it in this format +998*********.""");
        message.setChatId(chatId);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Send contact");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("⬅️  Back");
        row1.add(button1);
        row2.add(button2);
        rowList.add(row1);
        rowList.add(row2);
        markup.setResizeKeyboard(true);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendPhoto sale(Long chatId) {
        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File("D:\\bot\\sale.jpg")));
        photo.setCaption("BEPUL YETKAZIB BERAMIZ \uD83D\uDE9A \n" + " 3ta Maxi Box yoki ko’proq buyurtma qiling va bepul yetkazib berish xizmatiga ega bo’ling!\uD83D\uDE0B");
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("⬅️Back");
        rowList.add(row);
        row.add(button);
        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        photo.setReplyMarkup(markup);
        return photo;
    }

}
