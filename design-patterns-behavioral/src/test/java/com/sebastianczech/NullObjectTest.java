package com.sebastianczech;

import com.sebastianczech.nullobject.VlanEncapsulation;
import com.sebastianczech.nullobject.VlanEncapsulationData;
import org.junit.jupiter.api.Test;

import static com.sebastianczech.nullobject.VlanEncapsulationData.DOT_1_Q;
import static org.assertj.core.api.Assertions.assertThat;

public class NullObjectTest {

    @Test
    void should_get_dot1q_encapsulation() {
        VlanEncapsulation vlanEncapsulation = VlanEncapsulationData.getEncapsulation("dot1q");

        assertThat(vlanEncapsulation).isNotNull();
        assertThat(vlanEncapsulation.isNull()).isFalse();
        assertThat(vlanEncapsulation.getEncapsulation()).isEqualTo(DOT_1_Q);
    }

    @Test
    void should_get_no_encapsulation() {
        VlanEncapsulation vlanEncapsulation = VlanEncapsulationData.getEncapsulation(null);

        assertThat(vlanEncapsulation).isNotNull();
        assertThat(vlanEncapsulation.isNull()).isTrue();
    }

}
