package com.sebastianczech;

import com.sebastianczech.adapter.AuthenicationAdapter;
import com.sebastianczech.adapter.AuthenicationServiceBeta;
import com.sebastianczech.adapter.AuthenicationServiceLegacy;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdapterTest {

    @Test
    void should_authenticate_using_one_param_only() {
        AuthenicationServiceLegacy authenicationServiceLegacy = new AuthenicationServiceLegacy();
        AuthenicationServiceBeta authenicationServiceBeta = new AuthenicationServiceBeta();
        AuthenicationAdapter authenicationAdapter = new AuthenicationAdapter(authenicationServiceLegacy);
        authenicationServiceBeta.setToken("test");

        boolean result = authenicationAdapter.authenticateUsingOnlyOneParam(authenicationServiceBeta);

        assertThat(result).isEqualTo(true);
    }

}
