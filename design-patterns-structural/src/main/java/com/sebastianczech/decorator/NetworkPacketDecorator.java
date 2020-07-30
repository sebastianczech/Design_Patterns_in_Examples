package com.sebastianczech.decorator;

public abstract class NetworkPacketDecorator implements NetworkPacket {

    private final NetworkPacket networkPacket;

    public NetworkPacketDecorator(NetworkPacket networkPacket) {
        this.networkPacket = networkPacket;
    }

}
