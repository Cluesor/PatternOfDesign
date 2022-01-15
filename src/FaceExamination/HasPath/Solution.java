package FaceExamination.HasPath;

public class Solution {

    private static boolean hasPath(char [] matrix, int rows, int cols, char[] str){
        if (matrix == null || matrix.length == 0 || str == null || str.length == 0 || matrix.length != cols * rows || rows <= 0 || cols <= 0 || rows * cols <= str.length){
            return  false;
        }


        boolean [] visited = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (hasPath(matrix, i, j, rows, cols, visited, str, 0)){
                    return true;
                }
            }
        }
            return false;
    }


    private static boolean hasPath(char [] matrix, int i, int j, int rows, int cols, boolean[] flag, char [] str, int k){
        int index = i * cols + j;
        if (i < 0 || j < 0 || i >= rows || j >= cols || matrix[index] != str[k] || flag[index] == true){
            return false;
        }

        if (k == str.length - 1){
            return true;
        }
        flag[index] = true;


        if (hasPath(matrix, i - 1, j, rows, cols, flag, str, k + 1)||
                hasPath(matrix, i + 1, j, rows, cols, flag, str, k + 1)||
                hasPath(matrix, i, j - 1, rows, cols, flag, str, k + 1)||
                hasPath(matrix, i, j + 1, rows, cols, flag, str, k + 1))
        {
            return true;
        }
        flag[index] = false;
        return  false;
    }


    public static void main(String[] args) {
        char [] m = {'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'};
        int cols = 3;
        int rows = 4;
        char [] str1 = {'b','c','c','e','d'};    // 包含的路径
        char [] str2 = {'a','b','c','b'};    // 不包含的路径
        System.out.println(hasPath(m, rows, cols, str1));
        System.out.println(hasPath(m, rows, cols, str2));
    }

}
