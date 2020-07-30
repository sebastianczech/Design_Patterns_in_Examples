package com.sebastianczech;

import com.sebastianczech.decorator.NetworkPacket;
import com.sebastianczech.decorator.NetworkPacketDecorator;

public class TcpPacket extends NetworkPacketDecorator {

    private final NetworkPacket networkPacket;

    public TcpPacket(NetworkPacket networkPacket) {
        super(networkPacket);
        this.networkPacket = networkPacket;
    }

    @Override
    public String getStructure() {
        return networkPacket.getStructure() + "[tcp]";
    }

}
