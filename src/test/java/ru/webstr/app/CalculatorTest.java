package ru.webstr.app;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenOnePlusTwoThenCalculatedThree() {
        Calculator calc = new Calculator();
        int expected = 3;
        int actual = calc.sum(1, 2);
        assertThat(expected, is(actual));
    }
}