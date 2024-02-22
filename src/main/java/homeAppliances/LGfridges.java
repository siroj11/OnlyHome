package homeAppliances;

import org.telegram.telegrambots.meta.api.methods.send.SendMediaGroup;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.media.InputMedia;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaPhoto;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class LGfridges {
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
        button1.setText("Muzlatgich LG GN B272SLCB");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Muzlkatgich LG GN-F272SBCB.ABLQTAS");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Muzlatgich LG GC B399SMCL");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Muzlatgich LG GC B459SLCL");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Muzlatgich LG GN-B392SMBB.APZQCIS");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Muzlatgich LG GC X257CAEC");
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

    public SendMediaGroup LGgnB272SLCB(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/873/87377/192846/4e396093-5deb-42f3-9f9e-592ba97cd4d5.jpg");
        InputMedia inputMedia1 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/873/87377/166840/f4b3759b-979b-4b4e-b986-c8d116246285.jpg");
        List<InputMedia> list = new ArrayList<>();
        list.add(inputMedia);
        list.add(inputMedia1);
        SendMediaGroup sendMediaGroup = new SendMediaGroup();
        sendMediaGroup.setMedias(list);
        sendMediaGroup.setChatId(chatId);
        return sendMediaGroup;
    }

    public SendMessage LGgnB272SLCB_INFO(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("\n" +
                "Mahsulot haqida qisqacha malumot\n" +
                "Brend: LG\n" +
                "Muzlatish kamerasini eritish: No Frost\n" +
                "Umumiy hajmi: 187 l\n" +
                "Sovutgich kamerasi hajmi: 143 l\n" +
                "Muzlatish kamerasi hajmi: 44 l\n" +
                "Narxi: 6 500 000 so'm");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("LGgnB272SLCB_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMediaGroup  LGGNF272SBCB(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3558/355854/190191/2f6c18e1-f384-415d-96ba-3a06377ef087-small.webp");
        InputMedia inputMedia1 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3558/355854/190188/204cc1c2-0452-4973-a7f8-90677c47aaf6.webp");
        InputMedia inputMedia2 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3558/355854/190194/527e6c77-396b-42db-8f8a-bc00415c2a11-small.webp");
        InputMedia inputMedia3 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3558/355854/190193/b7765368-0f12-4843-a3a3-7f4a3cf075d3-small.webp");
        List<InputMedia> list = new ArrayList<>();

        list.add(inputMedia);
        list.add(inputMedia1);
        list.add(inputMedia2);
        list.add(inputMedia3);
        SendMediaGroup sendMediaGroup = new SendMediaGroup();
        sendMediaGroup.setMedias(list);
        sendMediaGroup.setChatId(chatId);
        return sendMediaGroup;
    }

    public SendMessage LGGNF272SBCB_info(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("\n" +
                "Mahsulot haqida qisqacha malumot\n" +
                "Brend: LG\n" +
                "Muzlatish kamerasini eritish: Total No Frost\n" +
                "Umumiy hajmi: 254 l\n" +
                "Sovutgich kamerasi hajmi: 198 l\n" +
                "Muzlatish kamerasi hajmi: 56 l\n" +
                "Narxi: 7 400 000 so'm");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("LGGNF272SBCB_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }
  /*  public SendMediaGroup  LGGNF272SBCB(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("");
        InputMedia inputMedia1 = new InputMediaPhoto("");
        List<InputMedia> list = new ArrayList<>();
        list.add(inputMedia);
        list.add(inputMedia1);
        SendMediaGroup sendMediaGroup = new SendMediaGroup();
        sendMediaGroup.setMedias(list);
        sendMediaGroup.setChatId(chatId);
        return sendMediaGroup;
    }

    public SendMessage LGGNF272SBCB_info(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("LGgnB272SLCB_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }  public SendMediaGroup  LGGNF272SBCB(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("");
        InputMedia inputMedia1 = new InputMediaPhoto("");
        List<InputMedia> list = new ArrayList<>();
        list.add(inputMedia);
        list.add(inputMedia1);
        SendMediaGroup sendMediaGroup = new SendMediaGroup();
        sendMediaGroup.setMedias(list);
        sendMediaGroup.setChatId(chatId);
        return sendMediaGroup;
    }

    public SendMessage LGGNF272SBCB_info(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("LGgnB272SLCB_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }  public SendMediaGroup  LGGNF272SBCB(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("");
        InputMedia inputMedia1 = new InputMediaPhoto("");
        List<InputMedia> list = new ArrayList<>();
        list.add(inputMedia);
        list.add(inputMedia1);
        SendMediaGroup sendMediaGroup = new SendMediaGroup();
        sendMediaGroup.setMedias(list);
        sendMediaGroup.setChatId(chatId);
        return sendMediaGroup;
    }

    public SendMessage LGGNF272SBCB_info(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("LGgnB272SLCB_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }  public SendMediaGroup  LGGNF272SBCB(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("");
        InputMedia inputMedia1 = new InputMediaPhoto("");
        List<InputMedia> list = new ArrayList<>();
        list.add(inputMedia);
        list.add(inputMedia1);
        SendMediaGroup sendMediaGroup = new SendMediaGroup();
        sendMediaGroup.setMedias(list);
        sendMediaGroup.setChatId(chatId);
        return sendMediaGroup;
    }

    public SendMessage LGGNF272SBCB_info(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("LGgnB272SLCB_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }*/

}
