package FaceExamination.LinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListPrint_Reverse {
    Stack<Integer> st1 = new Stack<>();

    LinkedList<Integer> lk1 = new LinkedList<>();

    int data;


    private void LinkedListAdd(int data){
        data = this.data;
        lk1.add(this.data);
    }

    private void LinkedListPrint(){
        for (int i: lk1) {    // 通过for循环遍历LinkedList
            System.out.println(i);
        }
    }

    private void StackPush(int data){
        st1.push(data);
    }

    private void StackPop(){
        System.out.println(st1.pop());
    }


    public static void main(String[] args) {
        LinkedListPrint_Reverse linkedListPrint_reverse = new LinkedListPrint_Reverse();

        linkedListPrint_reverse.LinkedListAdd(1);
        linkedListPrint_reverse.LinkedListAdd(2);
        linkedListPrint_reverse.LinkedListAdd(3);
        linkedListPrint_reverse.LinkedListAdd(4);
        linkedListPrint_reverse.LinkedListAdd(5);
        linkedListPrint_reverse.LinkedListPrint();
        System.out.println("###############");
//        linkedListPrint_reverse.LinkedListPrint();
        linkedListPrint_reverse.StackPush(1);
        linkedListPrint_reverse.StackPush(2);
        linkedListPrint_reverse.StackPush(3);
        linkedListPrint_reverse.StackPush(4);
        linkedListPrint_reverse.StackPop();
        linkedListPrint_reverse.StackPop();
        linkedListPrint_reverse.StackPop();
        linkedListPrint_reverse.StackPop();

    }

}
