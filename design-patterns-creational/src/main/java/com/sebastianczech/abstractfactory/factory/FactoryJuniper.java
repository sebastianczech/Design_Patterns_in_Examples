package com.sebastianczech.abstractfactory.factory;

import com.sebastianczech.abstractfactory.model.Chassis;
import com.sebastianczech.abstractfactory.model.ChassisJuniper;
import com.sebastianczech.abstractfactory.model.Port;
import com.sebastianczech.abstractfactory.model.PortJuniper;

public class FactoryJuniper extends AbstractFactory {
    @Override
    public Port createPort() {
        return new PortJuniper();
    }

    @Override
    public Chassis createChassis() {
        return new ChassisJuniper();
    }
}
