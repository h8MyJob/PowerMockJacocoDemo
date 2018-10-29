package com.hmj.pwrjccdm.sample;

public class SomeClass {
    public int add(int x, int y) {
        if (Configuration.isEnabled()) {
            return x + y;
        }
        return 0;
    }
}
