package com.company;

import java.io.IOException;
import java.sql.*;



public class Conn {
    public static java.sql.Connection connect;
    public static Statement st;
    public static ResultSet ressult;


    public static void Con() throws ClassNotFoundException, SQLException {
        connect = null;
        Class.forName("org.sqlite.JDBC");
        connect = DriverManager.getConnection("jdbc:sqlite:D:\\sqllite\\Telegramm.s3db");

    }

    public static void WriteDB(String chatId, String city) throws SQLException
    {
        st = connect.createStatement();
        st.execute("INSERT INTO 'subscribe' ('ChatId', 'City') VALUES ('" + chatId + "', '" + city + "'); ");
    }

    public static void DeleteDB(String chatId) throws SQLException
    {
        st = connect.createStatement();
        st.execute("DELETE FROM 'subscribe' WHERE ChatId = '" + chatId + "'; ");
    }

    public static void ReadDB() throws SQLException, IOException {
        st = connect.createStatement();
        ressult = st.executeQuery("SELECT * FROM subscribe");
        Bot bot = new Bot();

        while(ressult.next())
        {
            String id = ressult.getString("ChatId");
            String  city = ressult.getString("City");

            bot.sendMsg(id, WeatherData.getWeather(city));
        }

        ressult.close();

    }

    public static void CloseDB() throws SQLException
    {
        connect.close();
        st.close();
    }

}
