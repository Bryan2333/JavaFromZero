package com.collection_.set_.hashset_;

import java.util.Arrays;

public class HashSetStructure {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        //1. 创建一个数组，数组类型是Node[]
        Node[] table = new Node[16];
        System.out.println("table = " + Arrays.toString(table));

        Node john = new Node("john", null);
        table[2] = john;//将john放到table表索引为3的地方

        Node jack = new Node("jack", null);
        john.next = jack; //将jack结点挂载到john的下一个结点


        Node rose = new Node("Rose", null);
        jack.next = rose; //将rose结点挂载到jack的下一个结点

        Node lucy = new Node("Lucy", null);
        table[3] = lucy; //将luck放到table表索引为3的地方
        System.out.println("table = " + Arrays.toString(table));

        Node peter = new Node("Peter", null);
        lucy.next = peter;

        /*
       	table[2] = john -> jack -> rose
       	table[3] = lucy -> peter
       	*/
        
    }
}

//结点，存放数据，指向下一个结点
class Node {
    Object item; //存放数据
    Node next; //指向下一个结点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}