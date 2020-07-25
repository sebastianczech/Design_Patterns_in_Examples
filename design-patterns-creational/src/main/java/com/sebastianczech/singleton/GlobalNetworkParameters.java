package com.sebastianczech.singleton;

public class GlobalNetworkParameters {

    private GlobalNetworkParameters() {
    }

    public static GlobalNetworkParameters getInstance() {
        return GlobalNetworkParametersHolder.instance;
    }

    private static class GlobalNetworkParametersHolder {
        static final GlobalNetworkParameters instance = new GlobalNetworkParameters();
    }

}
