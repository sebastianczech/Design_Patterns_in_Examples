package com.sebastianczech.factorymethod;

public class OspfProtocol implements RoutingProtocol {
    @Override
    public RoutingTable getRoutingTable() {
        return new RoutingTable("ospf_routing_table");
    }
}
