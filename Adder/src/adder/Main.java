package adder;

import java.util.InputMismatchException;
import java.lang.IllegalArgumentException;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (IllegalArgumentException  e) {
            System.err.println("Please provide 1 or more arguments.  Usage: ./Main [-] numOne [numTwo [...]]");
        } catch (InputMismatchException e) {
	    System.err.println("Invalid input.  Only pass in integers or a minus as the first argument.  Usage: ./Main [-] numOne [numTwo [...]]");
	    }
    }

    private static int addArguments(String[] args) {
	if (args.length == 0) {
	    throw new InputMismatchException();
	}
        int sum = 0;
        boolean subtract = args[0].equals("-");
        for (int i = (subtract ? 1 : 0); i < args.length; i++) {
            sum += Integer.valueOf(args[i]);
        }
        if (subtract) {
            return sum-(2*sum);
        } else {
            return sum;
        }
    }
}
