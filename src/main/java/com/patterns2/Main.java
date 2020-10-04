package com.patterns2;

import com.patterns2.facade.NotificationService;
import lombok.var;

public class Main {
    public static void main(String[] args) {
        var service = new NotificationService();
        service.send("Hello world", "target");
    }
}
