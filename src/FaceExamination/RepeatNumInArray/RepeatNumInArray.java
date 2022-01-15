package FaceExamination.RepeatNumInArray;

import java.util.Arrays;
import java.util.HashMap;

// 存疑

public class RepeatNumInArray {
// Solution one
    private static boolean duplicatenum(int number[], int length, int[] duplication){
        if (number == null|| length <= 0){
            return false;
        }
//        for (int i = 1; i < length; i++) {
//            if (number[i] < 0 || number[i] < length - 1){   // 判断数组中是否包含负数
//                return false;
//            }
//        }


        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
//            while (number[i] != i){
                if (number[i] == number[i + 1]){
                    duplication[0] = number[i];
                    return true;
                }
//                int temp = number[i];
//                number[i] = number[temp];
//                number[temp] = temp;
            }
//        }
        return  false;
    }


    public static void main(String[] args) {
        int [] arr1 = new int[]{1,2,2,3};
        int [] dup = new int[6];
        System.out.println(duplicatenum(arr1, 4, dup));
//duplicatenum(1,2,3);
    }
}
