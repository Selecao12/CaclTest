package ru.webstr.app;

public class Converter {

    private static final double DOLLAR_TO_EURO_COURSE = 0.92;
    private static final double DOLLAR_TO_RUBLE_COURSE = 74.53;
    private static final double EURO_TO_RUBLE_COURSE = 80.78;

    public double euroToDollar(double euros) {
        return (double) Math.round((euros / DOLLAR_TO_EURO_COURSE) * 100) / 100;
    }

    public double euroToRuble(double euros) {
        return (double) Math.round((euros * EURO_TO_RUBLE_COURSE) * 100) / 100;
    }

    public double dollarToEuro(double dollars) {
        return (double) Math.round((dollars * DOLLAR_TO_EURO_COURSE) * 100) / 100;
    }

    public double dollarToRuble(double dollars) {
        return (double) Math.round((dollars * DOLLAR_TO_RUBLE_COURSE) * 100) / 100;
    }

    public double rubleToDollar(double rubles) {
        return (double) Math.round((rubles / DOLLAR_TO_RUBLE_COURSE) * 100) / 100;
    }

    public double rubleToEuro(double rubles) {
        return (double) Math.round((rubles / EURO_TO_RUBLE_COURSE) * 100) / 100;
    }


}
