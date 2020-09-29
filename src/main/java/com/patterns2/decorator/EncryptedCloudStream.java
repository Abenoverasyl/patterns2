package com.patterns2.decorator;

import lombok.var;

public class  EncryptedCloudStream extends CloudStream {
    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        super.write(encrypted);
    }

    private String encrypt(String data) {
        return "!@#$()@#$@@!#$";
    }
}
