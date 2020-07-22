package com.sebastianczech;

import com.sebastianczech.factory.AbstractFactory;
import com.sebastianczech.model.Vendor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AbstractFactoryTest {

    @Test
    void should_return_juniper_router() {
        AbstractFactory factory = AbstractFactory.getFactory(Vendor.Cisco);

        assertThat(factory).isNotNull();
    }

}
