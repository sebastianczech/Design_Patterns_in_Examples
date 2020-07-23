package com.sebastianczech.factory;

import com.sebastianczech.model.Chassis;
import com.sebastianczech.model.ChassisNokia;
import com.sebastianczech.model.Port;
import com.sebastianczech.model.PortNokia;

public class FactoryNokia extends AbstractFactory {
    @Override
    public Port createPort() {
        return new PortNokia();
    }

    @Override
    public Chassis createChassis() {
        return new ChassisNokia();
    }
}
