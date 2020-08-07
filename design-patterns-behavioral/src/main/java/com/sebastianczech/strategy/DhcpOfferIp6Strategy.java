package com.sebastianczech.strategy;

public class DhcpOfferIp6Strategy implements DhcpOfferIpStrategy {
    @Override
    public IpAddress offerIp() {
        return new IpAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334");
    }
}
