package com.sebastianczech.factorymethod;

public class BgpProtocol implements RoutingProtocol {
    @Override
    public RoutingTable getRoutingTable() {
        return new RoutingTable("bgp_routing_table");
    }
}
