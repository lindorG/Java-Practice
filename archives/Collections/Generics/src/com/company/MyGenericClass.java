package com.company;

public class MyGenericClass <Thing1, Thing2>{

    Thing1 x;
    Thing2 y;

    MyGenericClass(Thing1 x, Thing2 y) {
        this.x = x;
        this.y = y;
    }
//    // Return x
//    public Thing1 getValue() {
//        return x;
//    }

//    // Return y
    public Thing2 getValue() {
        return y;
    }
}