package com.sebastianczech.nullobject;

public class NoEncapsulation extends VlanEncapsulation {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getEncapsulation() {
        return "None";
    }
}
