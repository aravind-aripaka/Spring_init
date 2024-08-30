package com.example;

public class CloudProvider implements DatabaseProvider {

    public void getConnection() {
        System.out.println("Connecting to cloud");
    }
}
