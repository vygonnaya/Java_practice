public class Fibonacci {

    public static int[] getFibonacci(int number) {
        int[] result = new int[number];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i < number; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

    public static int calculateRecursiveFibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return calculateRecursiveFibonacci(number - 1) + calculateRecursiveFibonacci(number - 2);
    }
}
