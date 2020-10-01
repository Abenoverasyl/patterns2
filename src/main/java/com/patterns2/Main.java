package com.patterns2;

import com.patterns2.decorator.CloudStream;
import com.patterns2.decorator.Stream;

public class Main {
    public static void main(String[] args) {
        storeCreditCard(new CloudStream());
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
