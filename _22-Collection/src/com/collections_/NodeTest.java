package com.collections_;

public class NodeTest {
    public static void main(String[] args) {
        Node node1 = new Node(null, new Employee("张三"), null);
        Node node2 = new Node(node1, new Employee("李四"), null); // node2 -> node1
        Node node3 = new Node(node2, new Employee("王五"), null); // node3 -> node2 -> node1

        node1.setNext(node2); // node1 -> node2
        node2.setNext(node3); // node1 -> node2 -> node3

        Node first = node1;
        while (first != null) {
            System.out.println(first);
            first = first.getNext();
        }

        node1.setNext(node3);
        node3.setPrev(node1);

        first = node1;
        while (first != null) {
            System.out.println(first);
            first = first.getNext();
        }
    }
}

class Node {
    private Node prev = null;
    private Employee emp = null;
    private Node next = null;

    public Node(Node prev, Employee emp, Node next) {
        this.prev = prev;
        this.emp = emp;
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String toString() {
        return emp.getName();
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
