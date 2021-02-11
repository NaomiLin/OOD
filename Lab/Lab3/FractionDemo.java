package Lab.Lab3;

import java.util.Scanner;

public class FractionDemo {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)  {
    // if throws exception here, the program stop since main the upper level
        while (true) {

            Fraction f1 = null;
            Fraction f2 = null;
            try {
                f1 = askInput();

            } catch (DivisionByZeroException e) {
                e.printStackTrace();
                // we can assign the default value to f1 if error
            }

            try {

                f2 = askInput();
            } catch (DivisionByZeroException e) {
                e.printStackTrace();
            }

            if (f1.equals(f2)) { // since we didn't set any to f1/f2
                System.out.print(f1.toString() + " is equal to " + f2.toString());
            } else {
                System.out.print(f1.toString() + " is not equal to " + f2.toString());
            }

            if (!askContinue()) {
                break;
            }
        }
    }

    private static boolean askContinue() {
        System.out.print("");
        System.out.print("Do you want to another comparison? (y/n) ");
        String res = keyboard.next();
        return res.equals("y");
    }

    private static Fraction askInput() throws DivisionByZeroException {
        System.out.print("Please enter a numerator: ");
        int numerator = keyboard.nextInt();
        System.out.print("Please enter a denominator: ");
        int denominator = keyboard.nextInt();
        return new Fraction(numerator, denominator);
    }
}
