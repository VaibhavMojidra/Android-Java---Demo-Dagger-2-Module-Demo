package com.vaibhavmojidra.dagger2moduledemojava;

import dagger.Module;
import dagger.Provides;

@Module
public class BatteryModule {
    @Provides
    Battery provideBattery(){
       return new Battery();
    }
}
