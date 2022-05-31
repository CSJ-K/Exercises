package com.tw.exercise;

import java.sql.*;

public class JDBCexercise {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:55435/postgres",
                "postgres", "abc123");) {

            try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM website")) {
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        int ID = rs.getInt("id");
                        String name = rs.getString("name");
                        String url = rs.getString("url");
                        String alexa = rs.getString("alexa");
                        String country = rs.getString("country");
                        System.out.println("ID: " + ID
                                + "\n   name:" + name
                                + "\n   url:" + url
                                + "\n   alexa:" + alexa
                                + "\n   country:" + country);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}