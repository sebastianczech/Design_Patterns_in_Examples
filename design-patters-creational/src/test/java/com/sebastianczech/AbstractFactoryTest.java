package com.sebastianczech;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(ints = { 21, 14, 49 })
    public void should_return_number_greater_by_one_for_many_parameters(int number) {
        int output = number + a;

        assertThat(output).isEqualTo(number + 1);
    }

    @ParameterizedTest(name = "Should return {1} for {0}")
    @CsvSource(value = {"10:11", "21:22"}, delimiter = ':')
    void should_return_sum_of_numbers_for_given_input_numbers(int number, int expected) {
        int output = number + a;

        assertThat(output).isEqualTo(expected);
    }


}
