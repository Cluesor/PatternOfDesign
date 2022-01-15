package FaceExamination.MiniNumberRotateArray;


public class Solution {

    private static int MiniNumRotateArray(int [] a){

        if ( a == null || a.length == 0){
            return 0;
        }
        //  high即数组中最后一个元素的索引，low即数组中第一个元素的索引， mid即中间元素的索引
        int low = 0;
        int high = a.length - 1;
        while (low < high){
            int mid = low + (high - low) / 2;
            if (a[mid] >= a[high]){         // 如果中间元素大于结尾元素
                low = mid + 1;
            }else if (a[mid] == a[high]){
                high = high - 1;
            }
            else {
                high = mid;
            }


        }
        return a[low];
    }

    public static void main(String[] args) {
        int [] a = {3, 4, 5, 1, 2};
        System.out.println(MiniNumRotateArray(a));
    }
}
