package Lab.Lab3;

import java.util.Objects;

public class Fraction {
    private int numerator = 0;
    private int denominator = 1;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) throws DivisionByZeroException {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) throws DivisionByZeroException {
        // if throw new RuntimeException, no need to throws
        // IllegalArgumentEx is subclass of RuntimeException
        if (denominator == 0) {
            throw new DivisionByZeroException("");
        }
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // inherit from Object
    // if you want to compare two objects -> need to override the equals
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Fraction)) {
            return false;
        }
        Fraction otherFraction = (Fraction)other;
        return this.getNumerator() * otherFraction.getDenominator()
                == this.getDenominator() * otherFraction.getNumerator(); // getter() is better
    }

}

class DivisionByZeroException extends Exception { // runtime is major unchecked
    public DivisionByZeroException() {
        super("Division by zero");// call the function in exception
    }

    public DivisionByZeroException(String message) {
        super(message);
    }
}