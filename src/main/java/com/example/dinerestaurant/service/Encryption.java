package com.example.dinerestaurant.service;

import java.util.Base64;

public class Encryption {

    // Simple Base64 encoding as a placeholder
    public static String encrypt(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    public static String decrypt(String encoded) {
        return new String(Base64.getDecoder().decode(encoded));
    }
}