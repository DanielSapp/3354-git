package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide integers to add");
        }
    }

    private static int addArguments(String[] args) {
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
