package com.company;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException, MalformedURLException {
        System.out.println("Что будем запрашивать?");
        Scanner scanner = new Scanner(System.in);
        String API_QUERY = scanner.nextLine();

        URL path = new URL ("https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=\"" + API_QUERY + "\"");
        URLEncoder.encode(API_QUERY, "UTF-8");

        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(path.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Example result = null;
        Gson gson = new Gson();
        result = gson.fromJson(reader,Example.class);

        for (Search b : result.getQuery().getSearch()) {
            System.out.println("Заголовок: " + b.getTitle());
            System.out.println("\tКонтент: " + b.getSnippet());



    }
}}
