package com.sebastianczech.factory;

import com.sebastianczech.model.Chassis;
import com.sebastianczech.model.ChassisCisco;
import com.sebastianczech.model.Port;
import com.sebastianczech.model.PortCisco;

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
