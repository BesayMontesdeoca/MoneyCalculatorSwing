package moneycalculatorswing.model;

public class Number {

    private int numerator;
    private int denominator;

    public Number(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public Number(Number number) {
        this(number.getNumerator(), number.getDenominator());
    }

    public Number(int number) {
        this(number, 1);
    }

    public Number(long number) {
        this((int) number, 1);
    }

    public Number(double number) {
        this(0, 1);
        toFraction(number);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private void reduce() {
        PrimeNumbersCollection primes = new PrimeNumbersCollection();
        for (int prime : primes) {
            if (numerator < prime || denominator < prime)break;
            while (divisor(prime)) {
                numerator /= prime;
                denominator /= prime;
            }
        }
    }
    private void toFraction(double number) {
        while ((long) number != number) {
            number *= 10;
            denominator *= 10;
        }
        numerator = (int) number;
        reduce();
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return numerator + "";
        }
        return numerator+"/"+denominator+"";
    }

    private boolean divisor(int number) {
        return (numerator % number == 0 && denominator % number == 0);
    }
    
}
