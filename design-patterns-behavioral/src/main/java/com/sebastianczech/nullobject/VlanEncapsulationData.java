package com.sebastianczech.nullobject;

public class VlanEncapsulationData {

    public static final String DOT_1_Q = "dot1q";

    public static VlanEncapsulation getEncapsulation(String encap) {
        if (DOT_1_Q.equals(encap)) {
            return new Dot1qEncapsulation(DOT_1_Q);
        }
        return new NoEncapsulation();
    }
}
