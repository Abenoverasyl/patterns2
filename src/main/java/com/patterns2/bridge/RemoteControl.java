package com.patterns2.bridge;


// RemoteControl
//    SonyRemoteControl
//    SamsungRemoteControl
//    AdvancedRemoteControl
//       SonyAdvancedRemoteControl
//       SamsungAdvancedRemoteControl
//
// 2 types of remote controls -> 2 new classes


public abstract class RemoteControl {
    public abstract void turnOn();

    public abstract void turnOf();
}
