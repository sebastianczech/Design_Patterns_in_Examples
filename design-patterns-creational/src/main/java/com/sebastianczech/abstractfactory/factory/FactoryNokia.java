package com.sebastianczech.abstractfactory.factory;

import com.sebastianczech.abstractfactory.model.Chassis;
import com.sebastianczech.abstractfactory.model.ChassisNokia;
import com.sebastianczech.abstractfactory.model.Port;
import com.sebastianczech.abstractfactory.model.PortNokia;

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
