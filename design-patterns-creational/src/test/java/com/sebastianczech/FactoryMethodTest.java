package com.sebastianczech;

import com.sebastianczech.factorymethod.BgpProtocol;
import com.sebastianczech.factorymethod.OspfProtocol;
import com.sebastianczech.factorymethod.RoutingProtocol;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryMethodTest {

    @Test
    void shoud_create_ospf_routing_table() {
        RoutingProtocol routingProtocol = new OspfProtocol();

        assertThat(routingProtocol.getRoutingTable()).isNotNull();
        assertThat(routingProtocol.getRoutingTable().getRoutingTableName()).isNotNull();
        assertThat(routingProtocol.getRoutingTable().getRoutingTableName()).isEqualTo("ospf_routing_table");
    }

    @Test
    void shoud_create_bgp_routing_table() {
        RoutingProtocol routingProtocol = new BgpProtocol();

        assertThat(routingProtocol.getRoutingTable()).isNotNull();
        assertThat(routingProtocol.getRoutingTable().getRoutingTableName()).isNotNull();
        assertThat(routingProtocol.getRoutingTable().getRoutingTableName()).isEqualTo("bgp_routing_table");
    }

}
