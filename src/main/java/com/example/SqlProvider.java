package com.example;

public class SqlProvider implements DatabaseProvider {

    public void getConnection() {
        System.out.println("Connecting to MySQL");
    }
}
