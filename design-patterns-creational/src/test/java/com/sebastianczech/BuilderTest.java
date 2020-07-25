package com.sebastianczech;

import com.sebastianczech.builder.NetworkController;
import com.sebastianczech.builder.Port;
import com.sebastianczech.builder.PortConfiguratorDot1q1Gb;
import com.sebastianczech.builder.PortConfiguratorNoEncap100Mb;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BuilderTest {

    @Test
    void should_build_port_with_dot1q_encapsulation_and_1g_speed() {
        NetworkController networkController = new NetworkController();
        networkController.setPortConfigurator(new PortConfiguratorDot1q1Gb());

        networkController.preparePortConfiguration();
        Port port = networkController.getPort();

        assertThat(port).isNotNull();
        assertThat(port.getEncapsulation()).isEqualTo("dot1q");
        assertThat(port.getSpeed()).isEqualTo(1000000000L);
    }

    @Test
    void should_build_port_with_no_encapsulation_and_100m_speed() {
        NetworkController networkController = new NetworkController();
        networkController.setPortConfigurator(new PortConfiguratorNoEncap100Mb());

        networkController.preparePortConfiguration();
        Port port = networkController.getPort();

        assertThat(port).isNotNull();
        assertThat(port.getEncapsulation()).isNull();
        assertThat(port.getSpeed()).isEqualTo(1000000L);
    }

}
