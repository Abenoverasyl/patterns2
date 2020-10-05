package com.patterns2.bridge;


// RemoteControl
//    SonyRemoteControl
//    AdvancedRemoteControl
//       SonyAdvancedRemoteControl

public abstract class AdvancedRemoteControl extends RemoteControl {
    public abstract void setChannel(int number);
}
