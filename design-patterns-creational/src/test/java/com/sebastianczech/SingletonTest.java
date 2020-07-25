package com.sebastianczech;

import com.sebastianczech.singleton.GlobalNetworkParameters;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    void should_create_only_1_instance() {
        GlobalNetworkParameters globalNetworkParameters1 = GlobalNetworkParameters.getInstance();
        GlobalNetworkParameters globalNetworkParameters2 = GlobalNetworkParameters.getInstance();

        assertThat(globalNetworkParameters1).isNotNull();
        assertThat(globalNetworkParameters2).isNotNull();
        assertThat(globalNetworkParameters1).isEqualTo(globalNetworkParameters2);
    }

}
