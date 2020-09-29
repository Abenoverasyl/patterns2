package com.patterns2;

import com.patterns2.decorator.EncryptedCloudStream;
import lombok.var;

public class Main {
    public static void main(String[] args) {
        var cloudStream = new EncryptedCloudStream();
        cloudStream.write("Here's some data");
    }
}
