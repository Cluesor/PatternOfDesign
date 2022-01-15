package FaceExamination.Fibonacci;

/**
 *  自下而上实现斐波那契数列，例如根据f(0) 和f(1) 算出 f(2),这种思路的时间复杂度是O(n)
 */

public class Solution {

    private static long Fibnacci(int n){
        long  result[] = {0, 1};
        if (n < 2){   // 当 n < 2的时候，即当n=0，返回0， 当n = 1，返回1
            return result[n];
        }

        long  FibonacciOne = 1;
        long  FibonacciTwo = 0;
        long  FibnacciN = 0;


        for (int i = 2; i <= n; i++) {
            FibnacciN = FibonacciOne + FibonacciTwo;
            FibonacciTwo = FibonacciOne;
            FibonacciOne = FibnacciN;
            System.out.println(FibnacciN);

        }
        return FibnacciN;
    }


    public static void main(String[] args) {
        Fibnacci(100);
    }
}
