package com.patterns2.bridge;

public class SonyRemoteControl extends RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Sony: turnOn");
    }

    @Override
    public void turnOf() {
        System.out.println("Sony: turnOff");
    }
}
