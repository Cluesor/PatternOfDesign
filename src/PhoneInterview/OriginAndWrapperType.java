package PhoneInterview;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class OriginAndWrapperType {


    private static void sortPrint(ArrayList<Integer> list) {
        // write your code here
        list.sort(Comparator.reverseOrder());

        for(int i: list){
            System.out.print(i+"\n");
        }



    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(3);
//        list.add(2);
//        System.out.println(list);
//        sortPrint(list);


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) { // 使用for循环遍历区间[2,n]
            boolean isPrime = true;
            int m = (int)Math.sqrt(i);
            for (int j = 2; j <= m; j++) { // 在 2 到 sqrt(i) 中判断有无 i 的因子
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

}



