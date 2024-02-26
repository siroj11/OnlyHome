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

public class Fridges {
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
        button2.setText("Muzlkatgich LG 254l");
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

    public SendMediaGroup LG187l(Long chatId) {
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

    public SendMessage LG187l_info(Long chatId) {
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
        button.setCallbackData("LG187l_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMediaGroup LG254l(Long chatId) {
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

    public SendMessage LG254l_info(Long chatId) {
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
        button.setCallbackData("LG254l_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMediaGroup LG306l(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3559/355971/190485/bdca8dbf-bf84-4f1d-a0f3-36bdead824c7.webp");
        InputMedia inputMedia1 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3559/355971/190487/c89853da-2ce4-46b3-877c-3ee2873d253d.webp");
        InputMedia inputMedia2 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3559/355971/190486/cbddb8b0-603f-433f-8b8f-ebfbca5e614a.webp");
        List<InputMedia> list = new ArrayList<>();
        list.add(inputMedia);
        list.add(inputMedia1);
        list.add(inputMedia2);
        SendMediaGroup sendMediaGroup = new SendMediaGroup();
        sendMediaGroup.setMedias(list);
        sendMediaGroup.setChatId(chatId);
        return sendMediaGroup;
    }

    public SendMessage LG306l_info(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("\n" +
                "Mahsulot haqida qisqacha malumot\n" +
                "Brend: LG\n" +
                "Muzlatish kamerasini eritish: Total No Frost\n" +
                "Umumiy hajmi: 306 l\n" +
                "Sovutgich kamerasi hajmi: 202 l\n" +
                "Muzlatish kamerasi hajmi: 104 l\n" +
                "Narxi: 8 000 000 so'm");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("LG306l_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMediaGroup LG341l(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/808/80863/155959/6b4c2721-d223-402e-affc-85dac5a500e3.jpg");
        InputMedia inputMedia1 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/808/80863/155960/579c843e-0d55-4b68-a657-501ff51ed825-small.jpg");
        InputMedia inputMedia2 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/808/80863/155961/2d6ffb27-3010-42e1-b278-dcedb3f1f49c-small.jpg");
        List<InputMedia> list = new ArrayList<>();
        list.add(inputMedia);
        list.add(inputMedia1);
        list.add(inputMedia2);
        SendMediaGroup sendMediaGroup = new SendMediaGroup();
        sendMediaGroup.setMedias(list);
        sendMediaGroup.setChatId(chatId);
        return sendMediaGroup;
    }

    public SendMessage LG341l_info(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("\n" +
                "Mahsulot haqida qisqacha malumot\n" +
                "Brend: LG\n" +
                "Muzlatish kamerasini eritish: Total No Frost\n" +
                "Umumiy hajmi: 341 l\n" +
                "Sovutgich kamerasi hajmi: 234 l\n" +
                "Muzlatish kamerasi hajmi: 127 l\n" +
                "Narxi: 9 000 000 so'm");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("LG341l_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMediaGroup LG395l(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3557/355749/192806/27412b44-a185-434c-a77e-af9749f9e4ca.jpg");
        InputMedia inputMedia1 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3557/355749/189230/e471d749-8d55-4419-98d6-9d5c1c064a90-small.webp");
        InputMedia inputMedia2 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3557/355749/189224/76489c3c-1870-4612-bbe6-43f7daf9dd2a-small.webp");
        InputMedia inputMedia3 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3557/355749/189229/60b0fb6a-ba11-42d7-8c70-a94f24f4dfe2.webp");
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

    public SendMessage LG395l_info(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("\n" +
                "Mahsulot haqida qisqacha malumot\n" +
                "Brend: LG\n" +
                "Muzlatish kamerasini eritish:  No Frost\n" +
                "Umumiy hajmi: 395 l\n" +
                "Sovutgich kamerasi hajmi: 305 l\n" +
                "Muzlatish kamerasi hajmi: 90 l\n" +
                "Narxi: 10 000 000 so'm");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("LG35l_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMediaGroup LG617l(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3553/355305/192835/b78d0786-5326-4980-af3d-7be71bd9c0f4.jpg");
        InputMedia inputMedia1 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3553/355305/187555/0c69f2d6-2304-43c5-8a32-3d221bafe393.jpg");
        InputMedia inputMedia2 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3553/355305/187562/32063134-5dab-444f-96b2-3e59783258ff.jpg");
        List<InputMedia> list = new ArrayList<>();
        list.add(inputMedia);
        list.add(inputMedia1);
        list.add(inputMedia2);
        SendMediaGroup sendMediaGroup = new SendMediaGroup();
        sendMediaGroup.setMedias(list);
        sendMediaGroup.setChatId(chatId);
        return sendMediaGroup;
    }

    public SendMessage LG617l_info(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("\n" +
                "Mahsulot haqida qisqacha malumot\n" +
                "Brend: LG\n" +
                "Muzlatish kamerasini eritish:  No Frost\n" +
                "Umumiy hajmi: 617 l\n" +
                "Sovutgich kamerasi hajmi: 412 l\n" +
                "Muzlatish kamerasi hajmi: 205 l\n" +
                "Narxi: 20 000 000 so'm");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("LG617l_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    //SAMSUNG
    public SendMediaGroup SM290l(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/947/94702/172127/d443bc2d-556c-45d6-b43c-4257c17bd9a7-small.jpg");
        InputMedia inputMedia1 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/947/94702/172128/1bed8b89-54ad-4474-8e54-e2c5992abf61.jpg");
        InputMedia inputMedia2 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/947/94702/172131/14f50975-28b9-43a6-ad7f-9b5cab3f27aa.jpg");
        List<InputMedia> list = new ArrayList<>();
        list.add(inputMedia);
        list.add(inputMedia1);
        list.add(inputMedia2);
        SendMediaGroup sendMediaGroup = new SendMediaGroup();
        sendMediaGroup.setMedias(list);
        sendMediaGroup.setChatId(chatId);
        return sendMediaGroup;
    }

    public SendMessage SM290l_info(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("\n" +
                "Mahsulot haqida qisqacha malumot\n" +
                "Brend: SAMSUNG\n" +
                "Muzlatish kamerasini eritish: No Frost\n" +
                "Umumiy hajmi: 290 l\n" +
                "Sovutgich kamerasi hajmi: 192 l\n" +
                "Muzlatish kamerasi hajmi: 98 l\n" +
                "Narxi: 5 150 000 so'm");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("SM290l_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMediaGroup SM310l(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/807/80782/155748/b3eb707b-b32a-46b1-89e9-8634ecad85ba.jpg");
        InputMedia inputMedia1 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/807/80782/155749/8364f073-d55b-406d-bd94-8dbd427a2aea.jpg");
        InputMedia inputMedia2 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/807/80782/155751/529d3873-63ea-4560-a00c-2c848845d57c.jpg");
        List<InputMedia> list = new ArrayList<>();
        list.add(inputMedia);
        list.add(inputMedia1);
        list.add(inputMedia2);
        SendMediaGroup sendMediaGroup = new SendMediaGroup();
        sendMediaGroup.setMedias(list);
        sendMediaGroup.setChatId(chatId);
        return sendMediaGroup;
    }

    public SendMessage SM310l_info(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("\n" +
                "Mahsulot haqida qisqacha malumot\n" +
                "Brend: SAMSUNG\n" +
                "Muzlatish kamerasini eritish: No Frost\n" +
                "Umumiy hajmi: 310 l\n" +
                "Sovutgich kamerasi hajmi: 212 l\n" +
                "Muzlatish kamerasi hajmi: 98 l\n" +
                "Narxi: 9 785 000 so'm");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("SM310l_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMediaGroup SM367l(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/1024/102431/180021/075ec31a-b52e-449d-815e-ae5fdf56b88d.jpg");
        InputMedia inputMedia1 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/1024/102431/180025/2d1f06a4-a367-4650-9402-4013e3c167ce.jpg");
        InputMedia inputMedia2 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/1024/102431/180024/ddb76439-178e-4718-a996-7cd7ad68ab2e.jpg");
        List<InputMedia> list = new ArrayList<>();
        list.add(inputMedia);
        list.add(inputMedia1);
        list.add(inputMedia2);
        SendMediaGroup sendMediaGroup = new SendMediaGroup();
        sendMediaGroup.setMedias(list);
        sendMediaGroup.setChatId(chatId);
        return sendMediaGroup;
    }

    public SendMessage SM367l_info(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("\n" +
                "Mahsulot haqida qisqacha malumot\n" +
                "Brend: SAMSUNG\n" +
                "Muzlatish kamerasini eritish: No Frost\n" +
                "Umumiy hajmi: 367 l\n" +
                "Sovutgich kamerasi hajmi: 269 l\n" +
                "Muzlatish kamerasi hajmi: 98 l\n" +
                "Narxi: 10 197 000 so'm");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("SM367l_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMediaGroup SM388l(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3560/356072/192831/4d8fbfba-4a5f-4725-a971-f65257c34e0d.jpg");
        InputMedia inputMedia1 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3560/356072/191267/f6c7575a-e78d-448e-9af0-ee90eaac4d35.webp");
        InputMedia inputMedia2 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3560/356072/191266/215b7914-ac65-432d-9ac5-731ba13593e2.webp");
        List<InputMedia> list = new ArrayList<>();
        list.add(inputMedia);
        list.add(inputMedia1);
        list.add(inputMedia2);
        SendMediaGroup sendMediaGroup = new SendMediaGroup();
        sendMediaGroup.setMedias(list);
        sendMediaGroup.setChatId(chatId);
        return sendMediaGroup;
    }

    public SendMessage SM388l_info(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("\n" +
                "Mahsulot haqida qisqacha malumot\n" +
                "Brend: SAMSUNG\n" +
                "Muzlatish kamerasini eritish: No Frost\n" +
                "Umumiy hajmi: 388 l\n" +
                "Sovutgich kamerasi hajmi: 291 l\n" +
                "Muzlatish kamerasi hajmi: 97 l\n" +
                "Narxi: 11 845 000 so'm");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("SM388l_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMediaGroup SM460l(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3562/356269/192365/310bca39-01b8-48c9-978c-028fc2ad4752.webp");
        InputMedia inputMedia1 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3562/356269/192366/f22d346c-6062-4c4a-ada3-def6c50c3cd6.webp");
        List<InputMedia> list = new ArrayList<>();
        list.add(inputMedia);
        list.add(inputMedia1);
        SendMediaGroup sendMediaGroup = new SendMediaGroup();
        sendMediaGroup.setMedias(list);
        sendMediaGroup.setChatId(chatId);
        return sendMediaGroup;
    }

    public SendMessage SM460l_info(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("\n" +
                "Mahsulot haqida qisqacha malumot\n" +
                "Brend: SAMSUNG\n" +
                "Muzlatish kamerasini eritish: No Frost\n" +
                "Umumiy hajmi: 460 l\n" +
                "Sovutgich kamerasi hajmi: 353 l\n" +
                "Muzlatish kamerasi hajmi: 107 l\n" +
                "Narxi: 13 390 000 so'm");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("SM460l_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMediaGroup SM640l(Long chatId) {
        InputMedia inputMedia = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3549/354902/186637/e5ca840d-247d-4819-9f02-ffd4c266722e.jpg");
        InputMedia inputMedia1 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3549/354902/186641/d24920b7-e00e-40f7-924f-6e5d8a88c657.jpg");
        InputMedia inputMedia2 = new InputMediaPhoto("https://mini-io-api.texnomart.uz/catalog/product/3549/354902/186642/aaf9a724-5802-418b-ac4c-8073cdfe03df.jpg");
        List<InputMedia> list = new ArrayList<>();
        list.add(inputMedia);
        list.add(inputMedia1);
        list.add(inputMedia2);
        SendMediaGroup sendMediaGroup = new SendMediaGroup();
        sendMediaGroup.setMedias(list);
        sendMediaGroup.setChatId(chatId);
        return sendMediaGroup;
    }

    public SendMessage SM640l_info(Long chatId) {
        SendMessage message = new SendMessage();
        message.setText("\n" +
                "Mahsulot haqida qisqacha malumot\n" +
                "Brend: SAMSUNG\n" +
                "Muzlatish kamerasini eritish: No Frost\n" +
                "Umumiy hajmi: 640 l\n" +
                "Sovutgich kamerasi hajmi: 411 l\n" +
                "Muzlatish kamerasi hajmi: 299 l\n" +
                "Narxi: 22 660 000 so'm");
        message.setChatId(chatId);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Savatga qoshish");
        button.setCallbackData("SM640l_ID");
        row.add(button);
        rowList.add(row);
        markup.setKeyboard(rowList);
        message.setReplyMarkup(markup);
        return message;
    }
}
