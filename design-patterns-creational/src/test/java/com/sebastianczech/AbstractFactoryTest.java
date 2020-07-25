package com.sebastianczech;

import com.sebastianczech.abstractfactory.factory.AbstractFactory;
import com.sebastianczech.abstractfactory.model.Chassis;
import com.sebastianczech.abstractfactory.model.Port;
import com.sebastianczech.abstractfactory.model.Vendor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AbstractFactoryTest {

    @Test
    void should_get_factory_for_vendor_cisco() {
        AbstractFactory factory = AbstractFactory.getFactory(Vendor.Cisco);

        assertThat(factory).isNotNull();
    }

    @Test
    void should_get_port_for_vendor_cisco() {
        AbstractFactory factory = AbstractFactory.getFactory(Vendor.Cisco);
        Port port = factory.createPort();

        assertThat(factory).isNotNull();
        assertThat(port).isNotNull();
    }

    @Test
    void should_get_chassis_for_vendor_cisco() {
        AbstractFactory factory = AbstractFactory.getFactory(Vendor.Cisco);
        Chassis chassis = factory.createChassis();

        assertThat(factory).isNotNull();
        assertThat(chassis).isNotNull();
    }

}
