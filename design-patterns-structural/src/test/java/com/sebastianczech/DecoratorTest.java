package com.sebastianczech;

import com.sebastianczech.decorator.HttpPacket;
import com.sebastianczech.decorator.IpPacket;
import com.sebastianczech.decorator.NetworkPacket;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DecoratorTest {

    @Test
    void should_get_whole_http_packet() {
        // given
        NetworkPacket networkPacket = new HttpPacket(new TcpPacket(new IpPacket("192.168.1.2", 24)));

        // when
        String structure = networkPacket.getStructure();

        // then
        assertThat(structure).isNotNull();
        assertThat(structure).isEqualTo("192.168.1.2/24:[ip][tcp][http]");
    }

}
