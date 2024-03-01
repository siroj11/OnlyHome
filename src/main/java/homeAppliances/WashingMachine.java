package homeAppliances;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class WashingMachine {
    public SendMessage LGfridge(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Katalogni tanlang");
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton basket = new KeyboardButton();
        basket.setText("\uD83D\uDCCBSavat");
        KeyboardButton back = new KeyboardButton();
        back.setText("⬅️Back");
        row.add(basket);
        row.add(back);
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Muzlatgich LG 187l");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Muzlatgich LG 254l");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Muzlatgich LG 306l");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Muzlatgich LG 341l");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Muzlatgich LG 395l");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Muzlatgich LG 617l");
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

    public SendMessage SamsungFridge(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Katalogni tanlang");
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton basket = new KeyboardButton();
        basket.setText("\uD83D\uDCCBSavat");
        KeyboardButton back = new KeyboardButton();
        back.setText("⬅️Back");
        row.add(basket);
        row.add(back);
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Muzlatgich Samsung 290l");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Muzlatgich Samsung 310l");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Muzlatgich Samsung 367l");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Muzlatgich Samsung 388l");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Muzlatgich Samsung 460l");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Muzlatgich Samsung 640l");
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

    public SendMessage HaierFridge(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Katalogni tanlang");
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton basket = new KeyboardButton();
        basket.setText("\uD83D\uDCCBSavat");
        KeyboardButton back = new KeyboardButton();
        back.setText("⬅️Back");
        row.add(basket);
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Muzlatgich Haier 364l");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Muzlatgich Haier 346l");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Muzlatgich Haier 400l");
        row1.add(button1);
        row1.add(button2);
        row2.add(button3);
        row2.add(back);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row);
        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMessage HansaFridge(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Katalogni tanlang");
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton basket = new KeyboardButton();
        basket.setText("\uD83D\uDCCBSavat");
        KeyboardButton back = new KeyboardButton();
        back.setText("⬅️Back");
        row.add(basket);
        row.add(back);
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Muzlatgich Hansa 242l");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Muzlatgich Hansa 351l");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Muzlatgich Hansa 256l");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Muzlatgich Hansa 341l");
        row1.add(button1);
        row1.add(button2);
        row2.add(button3);
        row2.add(button4);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row);
        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMessage BekoFridge(Long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Katalogni tanlang");
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton basket = new KeyboardButton();
        basket.setText("\uD83D\uDCCBSavat");
        KeyboardButton back = new KeyboardButton();
        back.setText("⬅️Back");
        row.add(basket);
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Muzlatgich Beko 223l");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Muzlatgich Beko 280l");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Muzlatgich Beko 215l");
        row1.add(button1);
        row1.add(button2);
        row2.add(button3);
        row2.add(back);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row);
        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);
        message.setReplyMarkup(markup);
        return message;
    }

}