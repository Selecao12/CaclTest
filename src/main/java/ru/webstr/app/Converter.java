package ru.webstr.app;

import java.math.BigDecimal;

public class Converter {

    public double euroToDollar(double i) {
        BigDecimal euros = new BigDecimal(Double.toString(i));
        return euros.multiply(new BigDecimal(Double.toString(1.08))).doubleValue();
    }

    public double dollarToEuro(double i) {
        BigDecimal dollars = new BigDecimal(Double.toString(i));
        return dollars.multiply(new BigDecimal(Double.toString(0.92))).doubleValue();
    }
}
