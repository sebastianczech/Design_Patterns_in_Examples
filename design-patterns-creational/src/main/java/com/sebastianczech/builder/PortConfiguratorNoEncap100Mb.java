package com.sebastianczech.builder;

public class PortConfiguratorNoEncap100Mb extends PortConfigurator {
    @Override
    public void configureEncapsulation() {
        port.setEncapsulation(null);
    }

    @Override
    public void configureSpeed() {
        port.setSpeed(1000000L);
    }
}
