package com.patterns2;

import com.patterns2.decorator.CloudStream;
import com.patterns2.decorator.Stream;
import com.patterns2.facade.Message;
import com.patterns2.facade.NotificationServer;
import lombok.var;

public class Main {
    public static void main(String[] args) {
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appID", "key");
        var message = new Message("Hello World");
        server.send(authToken, message, "target");
        connection.disconnect();
    }
}
