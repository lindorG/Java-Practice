package com.package1;

public class WaterMonster extends Monster {
    WaterMonster(String name) {
        super(name);
    }
    @Override
    public String attack() {
        return "WM Attack";
    }
}
