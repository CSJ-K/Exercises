package com.tw.exercise.dao;

import java.sql.Connection;
import java.util.List;

public abstract class AbstractDao<T> {

    protected abstract Connection getConnection();

    public abstract List<T> listAll();

}
