package com.tw.exercise.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tw.exercise.domain.Website;

public class WebsiteDao extends AbstractDao<Website> {

    @Override
    protected Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:55435/postgres", "postgres", "abc123");
        } catch (SQLException e) {
            throw new RuntimeException("sql error", e);
        }
    }

    public List<Website> listAll() {
        List<Website> websites = new ArrayList<>();
        try (Connection conn = getConnection()) {
            try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM website")) {
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        long id = rs.getLong("id");
                        String name = rs.getString("name");
                        String url = rs.getString("url");
                        int alexa = rs.getInt("alexa");
                        String country = rs.getString("country");
                        websites.add( new Website(id, name, url, alexa, country));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("sql error", e);
        }
        return websites;
    }
}
