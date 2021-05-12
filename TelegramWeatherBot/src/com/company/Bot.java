package com.company;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bot extends TelegramLongPollingBot {

    private static final String NAME_OF_BOT = "WeatherBot";
    private static final String BOT_TOKEN = "1379055765:AAFqJPKkH-AYSm1Jd-xK8Gnup98I6si0Wvw";


    @Override
    public void onUpdateReceived(Update update) {
        String message = update.getMessage().getText();

        if(message.equals("/start")){
            sendMsg(update.getMessage().getChatId().toString(), "Hello, !"+ System.lineSeparator()+
                    "I am a weather Telegram bot." +
                    System.lineSeparator()+
                    "\n" +
                    "Enter the name of the city in Russian or English (for example Moscow or Москва) and I will tell you the weather for today\n" +
                     "Manual:\n" + "1) If you want to subscribe please type the next command - /subscribe-|NameOfCity| (Example: /subscribe-Moscow\n" +
                    "2) If you want to ubsubscribe please type the next command - /unsubscribe");
        }

        else if(message.contains("/subscribe")){
            try {
                Conn.Con();
                Conn.WriteDB(update.getMessage().getChatId().toString(), message.substring(11));
                Conn.CloseDB();
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }

            try {
                subSendMessege(update.getMessage().getChatId().toString(), "Subscription was successful!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else if (message.equalsIgnoreCase("/unsubscribe")) {
            try {
                Conn.Con();
                Conn.DeleteDB(update.getMessage().getChatId().toString());
                Conn.CloseDB();
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }

            try {
                Unsubscribe(update.getMessage().getChatId().toString(),"It is a pity that you have unsubscribed!" );
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else  {
            try {
                sendMsg(update.getMessage().getChatId().toString(), WeatherData.getWeather(message));
            }catch (IOException e){
                sendMsg(update.getMessage().getChatId().toString(), "City not found!!Enter the name of the city in Russian or English (for example Moscow or Москва) ");
            }
        }



    }


    public void sendMsg(String chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void subSendMessege(String chatId, String text) throws IOException {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void Unsubscribe(String chatId, String text) throws IOException {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }



    @Override
    public String getBotUsername() {
        return NAME_OF_BOT;
    }

    public String getBotToken() {
        return BOT_TOKEN;
    }


}
