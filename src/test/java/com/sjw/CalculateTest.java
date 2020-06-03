package com.sjw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {
    @Test
    public void testIntegerAdd() {
        Calculate calculate = new Calculate();
        int sum = calculate.add(1,3);
        assertThat(sum).isEqualTo(4);
        assertThat(sum).isNotEqualTo(5);
    }
}
