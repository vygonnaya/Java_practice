public class Main {

    public static void main(String[] args) {

        // 1. Factorial
        System.out.println("Factorial: " + Factorial.getFactorial(3));
        System.out.println("Recursive factorial: " + Factorial.getRecursiveFactorial(5));

        // 2. Get fibonacci array
        System.out.println("Fibonacci array: ");
        for (int n : Fibonacci.getFibonacci(7)) {
            System.out.println(n);
        }

        System.out.println("Recursive fibonacci: " + Fibonacci.calculateRecursiveFibonacci(7));

        // 3. Reverse array
        System.out.println("Reverse array: ");
        Integer[] arr = {1, 2, 3, 4, 5};
        ArrayTask.reverseArray(arr);

        //4. String split
        System.out.println("Split string: ");
        StringTask.splitStringWithDelimiter("Hello my world", " ");
    }
}
