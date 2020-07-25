package com.sebastianczech.builder;

public class PortConfiguratorDot1q1Gb extends PortConfigurator {

    @Override
    public void configureEncapsulation() {
        port.setEncapsulation("dot1q");
    }

    @Override
    public void configureSpeed() {
        port.setSpeed(1000000000L);
    }

}
