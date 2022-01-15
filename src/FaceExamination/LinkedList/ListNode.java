package FaceExamination.LinkedList;

import java.util.Stack;

public class ListNode {

    int val;
    ListNode next = null;

    public ListNode(){}

    public ListNode(int val) {
        this.val = val;
    }

    private static void ReversedPrintByStack(ListNode listNode){     // 借助栈来打印
        if (listNode == null){   // 若链表为空，返回false
            return;
        }

        Stack<Integer> st1 = new Stack<>();

        while(listNode != null){
            st1.push(listNode.val);   // 数据压入栈中
            listNode = listNode.next;   //指针域指向下一个指针
        }
        while (!st1.empty()){   // 当栈不为空的时候，将栈中数据从栈顶依次弹出
            System.out.println(st1.pop()+ " ");
        }
    }

// 通过递归实现，每访问到一个结点的时候，先递归输出它后面的结点，再输出该结点自身
    private static void ReversedPrintByRecursion(ListNode listNode){   // 借助递归打印，然而当链表较长时，函数调用层级加深，可能会导致函数调用栈溢出
        if (listNode != null){
            if (listNode.next != null){
                ReversedPrintByStack(listNode.next);
            }
            System.out.println(listNode.val+" ");
        }


    }


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode listNode3 = new ListNode();
        ListNode listNode4 = new ListNode();
        ListNode listNode5 = new ListNode();
        ListNode listNode6 = new ListNode();
        // 定义链表指针域next
        listNode1.next = listNode2;   // 当前节点的指针域指向下一个节点
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = null;      //链表最后一个元素的指针域为null
        // 定义链表数据域val
        listNode1.val = 1;
        listNode2.val = 2;
        listNode3.val = 3;
        listNode4.val = 4;
        listNode5.val = 5;
        listNode6.val = 6;

//        listNode.val
        ReversedPrintByStack(listNode1);
        System.out.println("#####################");
        ReversedPrintByRecursion(listNode1);
    }


}
