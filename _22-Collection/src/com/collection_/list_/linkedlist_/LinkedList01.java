package com.collection_.list_.linkedlist_;

public class LinkedList01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node smith = new Node("Smith");
        Node peter = new Node("peter");

        // jack -> tom -> peter
        jack.next = tom;
        tom.next = peter;

        //peter -> tom -> jack
        peter.prev = tom;
        tom.prev = jack;

        Node first = jack; //让first指向jack,就是双向链表的头
        Node last = peter; //让last指向peter，就是双向链表的尾

        //从头到尾
        System.out.println("==========从头到尾=========");
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        System.out.println("========从尾到头==========");
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.prev;
        }

        // tom ----------- peter之间插入 smith
        // tom -> smith -> peter
        smith.prev = tom;
        smith.next = peter;

        peter.prev = smith;
        tom.next = smith;

        first = jack;
        System.out.println("==========从头到尾=========");
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        last = peter;
        System.out.println("========从尾到头==========");
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.prev;
        }

    }
}

class Node {
    public Object item; //真正存放元素的地方
    public Node next; //指向后一个节点
    public Node prev; //指向前一个结点
    public String name;

    public Node(Object name) {
        this.item = name;
    }

    public String toString() {
        return "Node Name = " + item;
    }
}