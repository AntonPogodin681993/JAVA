package com.company;

import java.io.IOException;
import java.sql.SQLException;
import java.util.TimerTask;

public class OnTime extends TimerTask {
    @Override
    public void run() {
        try {
            Conn.Con();
            Conn.ReadDB();
            Conn.CloseDB();
        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        }

    }
}
