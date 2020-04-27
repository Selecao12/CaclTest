package ru.webstr.app;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenOnePlusTwoThenCalculatedThree() {
        Calculator calc = new Calculator();
        Integer expected = 3;
        Integer actual = calc.sum(1, 2);
        assertThat(expected, is(actual));
    }

    @Test
    public void whenTwoMinusOneThenCalculatedOne() {
        Calculator calc = new Calculator();
        Integer expected = 1;
        Integer actual = calc.minus(2, 1);
        assertThat(expected, is(actual));
    }

    @Test
    public void whenTwoMultiplyThreeCalculatedSix() {
        Calculator calculator = new Calculator();
        Integer expected = 6;
        Integer actual = calculator.multiply(2, 3);
        assertThat(expected, is(actual));
    }

    @Test
    public void whenSixDivideThreeCalculatedTwo() {
        Calculator calculator = new Calculator();
        Integer expected = 2;
        Integer actual = calculator.devide(6, 3);
        assertThat(expected, is(actual));
    }

    @Test
    public void whenSixRemainedByForCalculateTwo() {
        Calculator calculator = new Calculator();
        Integer expecteed = 2;
        Integer actual = calculator.remain(6, 4);
        assertThat(expecteed, is(actual));

    }

}