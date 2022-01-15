package FaceExamination.StackImplList;

import java.util.Stack;

public class Solution {


     private Stack<Integer> s1 = new Stack<>();
     private Stack<Integer> s2 = new Stack<>();
    private int size = 0;
     private  void Push(int node){
         s1.push(node);
         size ++;
    }

    private  void   Pop(){
      while (size > 0){
 if (s2.size() <= 0){
          int size1 = s1.size();
            for (int i = 0; i < size1; i++) {
               s2.push(s1.pop());


 }
 }
        size --;
          System.out.println(s2.pop()+" ");

      }
     }


    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.Push(1);
        solution.Push(2);
        solution.Push(3);
        solution.Pop();
        solution.Pop();
        solution.Pop();

    }



}
