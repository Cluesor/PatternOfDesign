package FaceExamination.RobotMovingRange;

public class Solution {

    private static int movingCount(int threshold, int rows, int cols){
        if (threshold < 0 || rows <= 0 || cols <= 0){
            return 0;
        }

        boolean [] visited = new boolean[rows * cols];
        for (int i = 0; i < rows * cols; i++) {
            visited[i] = false;
        }

        int count = movingCountCore(threshold, rows, cols, 0, 0, visited);
//        delete[] visited;
        return count;
    }


    private static int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[] flag){
        int count = 0;
        if (check(threshold, rows, cols, row, col, flag)){
            flag[row * cols + col] =true;

            count = 1 + movingCountCore(threshold, rows, cols, row - 1, col, flag) +
                    movingCountCore(threshold, rows, cols, row, col + 1, flag) +
                    movingCountCore(threshold, rows, cols, row - 1, col, flag) +
                    movingCountCore(threshold, rows, cols, row + 1, col, flag);
        }
        return count;
    }


    private static boolean check(int threshold, int rows, int cols, int row, int col, boolean[] flag){
    if( row >= 0 && col >= 0 && row < rows && col < cols && getDigitSum(row) + getDigitSum(col) <= threshold && ! flag[row * cols + col]){
        return true;
    }
    return false;
    }


    private static int getDigitSum(int number){
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
