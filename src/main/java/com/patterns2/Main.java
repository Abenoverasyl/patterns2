package com.patterns2;

import com.patterns2.facade.NotificationService;
import com.patterns2.flyweight.PointService;
import lombok.var;

public class Main {
    public static void main(String[] args) {
        var service = new PointService();
        for (var point : service.getPoints()) {
            point.draw();
        }
    }
}
