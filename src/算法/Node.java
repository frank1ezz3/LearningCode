package 算法;//jdk7

public class Node {//模拟一个链表
    private Object content;//内容
    private Node next;//链表里的next的属性

    public Node(Object content, Node next) {
        this.content = content;
        this.next = next;
    }

    public static void main(String[] args) {
        //这就是个链表
        Node header = new Node(new Object(),null);//header就是头节点
        header.next = new Node(new Object(),null);//header.next就是下一个节点

        header = new Node(new Object(),header);//直接插到头结点最快

        //如果要插在尾节点就要去遍历这个链表，找到节点.next是等于null的才行，相当麻烦
    }
}
