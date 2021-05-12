package com.company;

import okhttp3.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException {
    	System.out.println("Что будем запрашивать?");
		Scanner scanner = new Scanner(System.in);
		String API_QUERY = scanner.nextLine();

	 String path = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=\""+ API_QUERY +"\"";
	 URLEncoder.encode(path, "UTF-8");
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
				.url(path)
				.build();

		client.newCall(request).enqueue(new Callback() {
			@Override
			public void onFailure(Call call, IOException e) {
				e.printStackTrace();
			}

			@Override
			public void onResponse(Call call, Response response) throws IOException {
				if(response.isSuccessful()){
					String myResponce = response.body().string();
					System.out.println(myResponce);
				}
			}
		});

	}

		}


