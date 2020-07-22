package com.sebastianczech;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.Assertions.assertThat;

public class AbstractFactoryTest {

    static Integer a;

    @BeforeEach
    void setup() {
        a = 1;
    }

    @Test
    void should_return_number_greater_by_one() {
        a = a + 1;

        assertThat(1).isEqualTo(1);
    }

}
