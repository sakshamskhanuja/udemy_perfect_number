public class Main {
    public static void main(String[] args) {
        // Checks if 6 is a perfect number.
        System.out.println(isPerfectNumber(6));

        // Checks if 28 is a perfect number.
        System.out.println(isPerfectNumber(28));

        // Checks if 5 is a perfect number.
        System.out.println(isPerfectNumber(5));

        // Checks if -1 is a perfect number.
        System.out.println(isPerfectNumber(-1));
    }

    /**
     * Checks whether a number is a perfect number.
     */
    public static boolean isPerfectNumber(int number) {
        // Checks for invalid value.
        if (number < 1) {
            return false;
        }

        // Stores the sum of all divisors that perfectly divide the number.
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}