package com.sebastianczech.factory;

import com.sebastianczech.model.Chassis;
import com.sebastianczech.model.ChassisJuniper;
import com.sebastianczech.model.Port;
import com.sebastianczech.model.PortJuniper;

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
