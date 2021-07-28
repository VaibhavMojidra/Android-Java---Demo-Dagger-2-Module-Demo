package com.vaibhavmojidra.dagger2moduledemojava;

import dagger.Component;

@Component(modules={BatteryModule.class})
public interface SmartPhoneComponent {
    public SmartPhone getSmartPhone();
}
