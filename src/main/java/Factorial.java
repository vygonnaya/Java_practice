public class Factorial {

    public static Integer getFactorial(int number) {
        Integer result = 1;
        for (int i = 1; i < number; i++) {
            result *= i + 1;
        }
        return result;
    }

    public static Integer getRecursiveFactorial(int number) {
        if (number <= 0) {
            return 1;
        } else {
            return number * getRecursiveFactorial(number - 1);
        }
    }
}
