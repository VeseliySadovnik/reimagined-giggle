package com.example;

public class CheckNumber {
    public boolean isValidPhoneNumber(String phone) {
        if (phone == null)
        {
            throw new IllegalArgumentException("Phone number cannot be null");
        }
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }
}
