package com.package1;

public class FireMonster extends Monster {
    FireMonster (String name) {
        super(name);
    }
    @Override
    public String attack() {
        return "FM attack";
    }
}