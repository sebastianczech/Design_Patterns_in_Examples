package com.sebastianczech.decorator;

public class HttpPacket extends NetworkPacketDecorator {

    private final NetworkPacket networkPacket;

    public HttpPacket(NetworkPacket networkPacket) {
        super(networkPacket);
        this.networkPacket = networkPacket;
    }

    @Override
    public String getStructure() {
        return networkPacket.getStructure() + "[http]";
    }
}
