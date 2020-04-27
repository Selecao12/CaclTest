package ru.webstr.app;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenEuroConvertedToDollar() {
        Converter converter = new Converter();
        double expected = 2.17;
        double actual = converter.euroToDollar(2);
        assertThat(expected, is(actual));
    }

    @Test
    public void whenEuroConvertedToRuble() {
        Converter converter = new Converter();
        double expected = 161.56;
        double actual = converter.euroToRuble(2);
        assertThat(expected, is(actual));
    }

    @Test
    public void whenDollarConvertedToEuro() {
        Converter converter = new Converter();
        double expected = 2.76;
        double actual = converter.dollarToEuro(3);
        assertThat(expected, is(actual));
    }

    @Test
    public void whenDollarConvertedToRuble() {
        Converter converter = new Converter();
        double expected = 74.53;
        double actual = converter.dollarToRuble(1);
        assertThat(expected, is(actual));
    }

    @Test
    public void whenRubleConverterToDollar() {
        Converter converter = new Converter();
        double expected = 2;
        double actual = converter.rubleToDollar(149.06);
        assertThat(expected, is(actual));
    }

    @Test
    public void whenRubleConverterToEuro() {
        Converter converter = new Converter();
        double expected = 1.19;
        double actual = converter.rubleToEuro(96);
        assertThat(expected, is(actual));
    }

}