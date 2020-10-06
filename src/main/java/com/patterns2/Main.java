package com.patterns2;

import com.patterns2.proxy.Ebook;
import com.patterns2.proxy.Library;
import lombok.var;

public class Main {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName : fileNames) {
            library.add(new Ebook(fileName));
        }

        library.openEbook("a");
    }
}
