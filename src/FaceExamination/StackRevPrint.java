package FaceExamination;

import java.util.Stack;

public class StackRevPrint {

    private static class Nodelist{
        private int val;
        private Nodelist next = null;

        Nodelist(){
            this.val = val;

        }
    }


    private static void StackRePrint(Nodelist nodelinst){

        Stack<Integer> s1 = new Stack<>();

        if (nodelinst == null){
            return;
        }

        while (nodelinst != null){
        s1.push(nodelinst.val);
        nodelinst = nodelinst.next;

        }

        while (!s1.empty()){
                 System.out.println(s1.pop()+" ");
        }



    }


    public static void main(String[] args) {
        Nodelist n1 = new Nodelist();
        Nodelist n2 = new Nodelist();
        Nodelist n3 = new Nodelist();
        Nodelist n4 = new Nodelist();
        Nodelist n5 = new Nodelist();
        Nodelist n6 = new Nodelist();
        Nodelist n7 = new Nodelist();
        Nodelist n8 = new Nodelist();

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = null;


        n1.val = 1;
        n2.val = 2;
        n3.val = 3;
        n4.val = 4;
        n5.val = 5;
        n6.val = 6;
        n7.val = 7;
        n8.val = 8;

        StackRePrint(n1);
    }


}
