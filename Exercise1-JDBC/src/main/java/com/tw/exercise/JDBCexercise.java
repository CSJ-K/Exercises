package com.tw.exercise;

import com.tw.exercise.dao.WebsiteDao;

public class JDBCexercise {

    public static void main(String[] args) {
        new WebsiteDao().listAll().forEach(System.out::println);
    }

}