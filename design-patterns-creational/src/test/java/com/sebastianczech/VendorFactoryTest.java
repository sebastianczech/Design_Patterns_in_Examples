package com.sebastianczech;

import com.sebastianczech.factory.VendorFactory;
import com.sebastianczech.model.Vendor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VendorFactoryTest {

    @Test
    void should_get_factory_for_vendor_cisco() {
        VendorFactory factory = VendorFactory.getFactory(Vendor.Cisco);

        assertThat(factory).isNotNull();
    }

}
