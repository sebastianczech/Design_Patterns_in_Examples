package com.sebastianczech;

import com.sebastianczech.strategy.DhcpOfferIp4Strategy;
import com.sebastianczech.strategy.DhcpOfferIp6Strategy;
import com.sebastianczech.strategy.DhcpOfferIpStrategy;
import com.sebastianczech.strategy.IpAddress;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrategyTest {

    @Test
    void should_offer_ipv4_address() {
        // given
        DhcpOfferIpStrategy strategy = new DhcpOfferIp4Strategy();

        // when
        IpAddress ip = strategy.offerIp();

        // then
        assertThat(ip).isNotNull();
        assertThat(ip.getIp()).isEqualTo("127.0.0.1");
    }

    @Test
    void should_offer_ipv6_address() {
        // given
        DhcpOfferIpStrategy strategy = new DhcpOfferIp6Strategy();

        // when
        IpAddress ip = strategy.offerIp();

        // then
        assertThat(ip).isNotNull();
        assertThat(ip.getIp()).isEqualTo("2001:0db8:85a3:0000:0000:8a2e:0370:7334");
    }

}
