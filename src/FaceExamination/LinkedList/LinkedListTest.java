package FaceExamination.LinkedList;


import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LinkedListTest{


  // 单链表创建

    int data;  // data域
    LinkedListTest next = null;     // 节点node

    private  LinkedListTest(int data) {
        this.data = data;
    }

    // 添加新节点
    private  void Nodeadd(int new_data){
        LinkedListTest NewNode = new LinkedListTest(new_data);
        if (this.next == null){   //从尾部插入新节点
            this.next = NewNode;
        }else {
            this.next.Nodeadd(new_data);
        }
    }

    // 从头到尾链表打印
    private void LinkedListPrint(){
        System.out.println(this.data);
        if (this.next != null){
            System.out.println("-->");
            this.next.LinkedListPrint();
        }
    }



    private void test(){
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(1);
        s1.push(2);
//        s1.push(3);
//        s1.push(4);
//        s1.push(5);
//        s1.push(6);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
//        System.out.println(s1.pop());

    }

    public static void main(String[] args) {
        LinkedListTest linkedList = new LinkedListTest(1);  // 创建链表对象
//        linkedList.Nodeadd(2);
//        linkedList.Nodeadd(3);
//        linkedList.LinkedListPrint();

        linkedList.test();

    }



}


