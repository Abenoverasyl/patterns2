package com.patterns2.decorator;

import lombok.var;

public class  EncryptedCloudStream implements Stream {
    private Stream stream;

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt(String data) {
        return "!@#$()@#$@@!#$";
    }
}
