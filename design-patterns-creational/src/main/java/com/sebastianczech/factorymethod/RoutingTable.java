package com.sebastianczech.factorymethod;

import java.util.List;

public class RoutingTable {

    String routingTableName;
    List<Route> routes;

    public RoutingTable(String routingTableName) {
        this.routingTableName = routingTableName;
    }

    public String getRoutingTableName() {
        return routingTableName;
    }

    public List<Route> getRoutes() {
        return routes;
    }
}
