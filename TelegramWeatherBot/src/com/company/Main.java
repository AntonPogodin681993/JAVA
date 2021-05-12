package com.company;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import java.util.Calendar;
import java.util.Timer;

public class Main {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            ApiContextInitializer.init();
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

            Timer timer = new Timer();
            Calendar date = Calendar.getInstance();
            date.set(Calendar.HOUR,9);
            date.set(Calendar.MINUTE,42);
            date.set(Calendar.SECOND,00);
            date.set(Calendar.MILLISECOND,0);
            timer.schedule(
                    new OnTime(),
                    date.getTime(),
                    1000 * 60 * 60 * 24 * 7
            );


            try {
                telegramBotsApi.registerBot(new Bot());
            } catch (TelegramApiRequestException e) {
                e.printStackTrace();
            }
        });
        thread.start();

    }
    }

