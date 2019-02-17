package com.example.android.vitbus;


public class Temp {
    public static MyDBHandler myDBHandler;

    public static MyDBHandler getMyDBHandler() {
        return myDBHandler;
    }

    public static void setMyDBHandler(MyDBHandler myDBHandler) {
        Temp.myDBHandler = myDBHandler;
    }
}