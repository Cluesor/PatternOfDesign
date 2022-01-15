package FaceExamination.Sort;

import java.util.Arrays;

public class QuickSort {

    private static void Sort(int[] a, int start, int end ){
        int i, j, index;

        if (start > end){
            return ;
        }
        i = start;
        j = end;
        index = a[i];   // 用子表的第一个记录做基准

        while (i < j){      // 从表的两端交替向中间扫描
            while (i < j && a[j] >= index){   // 从尾部扫描时，当尾部元素大于基准时，则继续从后往前扫描
                j--;
            }
            if (i < j){
                a[i++] = a[j];   // 用比基准小的记录替换低位记录
            }
            while(i < j && a[i] < index){
                i++;
            }
            if (i < j){
                a[j--] = a[i];      // 用比基准大的记录替换高位记录
            }
        }

        a[i] = index;
        Sort(a, start, i - 1);
        Sort(a, i + 1, end);
    }

    private static void quicjsort(int[] a){
        Sort(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int [] a = { 49, 38, 65, 97, 76, 13, 27, 49 };
        quicjsort(a);
        System.out.println(Arrays.toString(a));
    }
}
