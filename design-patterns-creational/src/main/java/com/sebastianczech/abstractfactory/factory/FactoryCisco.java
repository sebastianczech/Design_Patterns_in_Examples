package com.sebastianczech.abstractfactory.factory;

import com.sebastianczech.abstractfactory.model.Chassis;
import com.sebastianczech.abstractfactory.model.ChassisCisco;
import com.sebastianczech.abstractfactory.model.Port;
import com.sebastianczech.abstractfactory.model.PortCisco;

public class FactoryCisco extends AbstractFactory {
    @Override
    public Port createPort() {
        return new PortCisco();
    }

    @Override
    public Chassis createChassis() {
        return new ChassisCisco();
    }
}
