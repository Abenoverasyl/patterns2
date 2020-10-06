package com.patterns2;

import com.patterns2.bridge.AdvancedRemoteControl;
import com.patterns2.bridge.SamsungTV;
import lombok.var;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new AdvancedRemoteControl(new SamsungTV());
        remoteControl.turnOn();
    }
}
