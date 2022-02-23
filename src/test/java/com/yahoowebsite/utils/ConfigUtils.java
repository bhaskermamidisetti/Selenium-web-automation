package com.yahoowebsite.utils;

public class ConfigUtils {

    private static final String BASE_URL = "http://yahoo.com/";
    private static final String DRIVER_PATH = "src/test/resources/driver/chromedriver 3/";

    public static String getBaseURL() {
        return BASE_URL;
    }

    public static String getDriverPath() {
        return DRIVER_PATH;
    }
}