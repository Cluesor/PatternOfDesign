package FaceExamination.Fibonacci;


/**
 *  使用递归实现斐波那契数列，效率较低
 */


public class RecursionSolution {

    private static int FibonacciRecursion(int n){
        if (n <= 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }
//        System.out.println(FibonacciRecursion(n - 1) + FibonacciRecursion(n - 2));
        return FibonacciRecursion(n - 1) + FibonacciRecursion(n - 2);
    }


    public static void main(String[] args) {
        FibonacciRecursion(100);
    }
}
