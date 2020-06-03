package com.sjw.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DollerTest {
    @Test
    public void testMultiplication() {
        Dollar five= new Dollar(5);
        five.times(2);
        assertThat(five.amount).isEqualTo(10);

    }
}
