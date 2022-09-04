package com.megapapa;

import java.sql.SQLDataException;
import java.sql.SQLException;

public abstract class Parent {

    public void method() throws SQLException {

        throw new SQLException();
    }
}
