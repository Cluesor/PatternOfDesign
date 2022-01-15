package FaceExamination.TwoDimensionArrayDumpNum;



public class TwoDimensionArrayDumpNum {


    private static boolean Find(int target, int [][]matrix){
         int column_index = 0;
         int row_index = 0;
        column_index =  matrix.length - 1;
        row_index = matrix[0].length - 1;
        int i = column_index; // 从最后一行开始
        int j = 0;  // 从第一列开始

        while (i >= 0 & j <= row_index){
            if (target > matrix[i][j]){
                j += 1;
            }
            else if (target < matrix[i][j]){
                i -= 1;
            }
            else {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int [][]mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Find(3, mat));
//        Find(1, mat);


    }

}
