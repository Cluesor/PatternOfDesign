package FaceExamination.FrogJump;

public class JumpByRecursion {

    private static int JumpMethod(int n){
        if (n < 0){
            return 0;
        }
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return 1;
        }
        return JumpMethod(n -1)+ JumpMethod(n - 2);
    }

    public static void main(String[] args) {
        JumpMethod(4);
    }
}
