package com.sebastianczech.factory;

import com.sebastianczech.model.Chassis;
import com.sebastianczech.model.Port;
import com.sebastianczech.model.Vendor;

public abstract class AbstractFactory {

    private static final FactoryCisco factoryCisco = new FactoryCisco();
    private static final FactoryJuniper factoryJuniper = new FactoryJuniper();
    private static final FactoryNokia factoryNokia = new FactoryNokia();

    public static AbstractFactory getFactory(Vendor vendor) {
        AbstractFactory factory = null;
        switch (vendor) {
            case Cisco:
                factory = factoryCisco;
                break;
            case Juniper:
                factory = factoryJuniper;
                break;
            case Nokia:
                factory = factoryNokia;
                break;
        }
        return factory;
    }

    public abstract Port createPort();

    public abstract Chassis createChassis();

}
