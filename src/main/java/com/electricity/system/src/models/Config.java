package com.electricity.system.src.models;

public class Config {
    private final String mainPath = System.getProperty("user.dir") + "\\src\\main\\resources\\data\\";
    private final String billPath = "bills.json";
    private final String clientPath = "clients.json";
    private final String adminPath = "admin.json";
    private final String tariffsPath = "tariffs.json";
    // Constructors
    public Config() {}
    // Getters
    public String getBillPath() {
        return billPath;
    }

    public String getClientPath() {
        return clientPath;
    }

    public String getAdminPath() {
        return adminPath;
    }

    public String getMainPath() {
        return mainPath;
    }
    public String getTariffsPath() {
        return tariffsPath;
    }
}
