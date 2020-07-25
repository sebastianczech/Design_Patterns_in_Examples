package com.sebastianczech.builder;

public abstract class PortConfigurator {

    protected Port port;

    public Port getPort() {
        return port;
    }

    public void createNewPort() {
        port = new Port();
    }

    public abstract void configureEncapsulation();

    public abstract void configureSpeed();

}
