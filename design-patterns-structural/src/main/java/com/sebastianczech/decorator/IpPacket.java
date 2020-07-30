package com.sebastianczech.decorator;

public class IpPacket implements NetworkPacket {

    String address;
    Integer netmask;

    public IpPacket(String address, Integer netmask) {
        this.address = address;
        this.netmask = netmask;
    }

    @Override
    public String getStructure() {
        return address + "/" + netmask + ":" + "[ip]";
    }
}
