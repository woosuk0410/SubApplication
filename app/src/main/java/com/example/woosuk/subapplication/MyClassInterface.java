package com.example.woosuk.subapplication;

import com.example.library.MyClass;

public class MyClassInterface {

    public MyClass getMyClassInstance() {
        return new MyClass(1, "test");
    }

    public int getIntValue() {
        return 99;
    }
}
