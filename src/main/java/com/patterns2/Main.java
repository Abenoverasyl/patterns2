package com.patterns2;

import com.patterns2.proxy.Library;
import com.patterns2.proxy.LoggingEbookProxy;
import lombok.var;

public class Main {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName : fileNames) {
            library.add(new LoggingEbookProxy(fileName));
        }

        library.openEbook("a");
        library.openEbook("b");
        library.openEbook("c");
    }
}
