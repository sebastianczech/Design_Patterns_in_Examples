package com.sebastianczech.strategy;

public class DhcpOfferIp4Strategy implements DhcpOfferIpStrategy {

    @Override
    public IpAddress offerIp() {
        return new IpAddress("127.0.0.1");
    }

}
