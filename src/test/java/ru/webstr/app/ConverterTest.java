package ru.webstr.app;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenEuroConvertedToDollar() {
        Converter converter = new Converter();
        double expected = 2.16;
        double actual = converter.euroToDollar(2);
        assertThat(expected, is(actual));
    }

    @Test
    public void whenDollarConvertedToEuro() {
        Converter converter = new Converter();
        double expected = 2.76;
        double actual = converter.dollarToEuro(3);
        assertThat(expected, is(actual));
    }

}