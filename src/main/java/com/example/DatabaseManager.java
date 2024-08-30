package com.example;

public class DatabaseManager implements DatabaseProvider{
    DatabaseProvider provider;
    public DatabaseManager(DatabaseProvider provider) {
        this.provider = provider;
    }

    @Override
    public void getConnection() {
        provider.getConnection();
    }
}

