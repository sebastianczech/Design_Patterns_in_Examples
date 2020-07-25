package com.sebastianczech.builder;

public class NetworkController {
    PortConfigurator portConfigurator;

    public void setPortConfigurator(PortConfigurator portConfigurator) {
        this.portConfigurator = portConfigurator;
    }

    public void preparePortConfiguration() {
        portConfigurator.createNewPort();
        portConfigurator.configureEncapsulation();
        portConfigurator.configureSpeed();
    }

    public Port getPort() {
        return portConfigurator.getPort();
    }

}

