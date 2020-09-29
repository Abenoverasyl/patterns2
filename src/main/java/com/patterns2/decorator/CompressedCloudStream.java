package com.patterns2.decorator;

import lombok.var;

public class CompressedCloudStream extends CloudStream {
    @Override
    public void write(String data) {
        var compressed = compress(data);
        super.write(compressed);
    }

    private String compress(String data) {
        return data.substring(0, 5);
    }
}
