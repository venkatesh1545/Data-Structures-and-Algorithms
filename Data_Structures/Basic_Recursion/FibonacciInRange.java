package Data_Structures.Basic_Recursion;

public class FibonacciInRange {
    public static void fibonacciInRange(int start, int end, int a, int b) {
        if (a > end) {
            return;
        }
        
        if (a >= start) {
            System.out.print(a + " ");
        }
        
        fibonacciInRange(start, end, b, a + b);
    }

    public static void main(String[] args) {
        int start = 10;
        int end = 100;
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci numbers between " + start + " and " + end + ":");
        fibonacciInRange(start, end, a, b);
    }
}
