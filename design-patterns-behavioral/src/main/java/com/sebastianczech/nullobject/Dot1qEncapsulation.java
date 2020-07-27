package com.sebastianczech.nullobject;

public class Dot1qEncapsulation extends VlanEncapsulation {

    public Dot1qEncapsulation(String encapsulation) {
        this.encapsulation = encapsulation;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getEncapsulation() {
        return this.encapsulation;
    }
}
