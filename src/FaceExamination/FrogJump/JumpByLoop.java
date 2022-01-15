package FaceExamination.FrogJump;

public class JumpByLoop {
    private static int JumpMethod(int n){
        int res[] = {0, 1};
        if (n < 2){
            return res[n];
        }

        int FibonacciOne = 1;
        int FibonacciTwo = 1;
        int FibonacciN = 0;

        for (int i = 2; i <= n ; i++) {
            FibonacciN = FibonacciOne + FibonacciTwo;
            FibonacciTwo = FibonacciOne;
            FibonacciOne = FibonacciN;
        }
        System.out.println(FibonacciN);
        return FibonacciN;
    }

    public static void main(String[] args) {
        JumpMethod(3);
    }
}
