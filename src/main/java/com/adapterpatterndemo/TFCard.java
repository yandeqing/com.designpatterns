package com.adapterpatterndemo;

public interface TFCard {
    String readTF();    
    int writeTF(String msg);
}