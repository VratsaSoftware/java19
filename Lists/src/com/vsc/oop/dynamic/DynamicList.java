package com.vsc.oop.dynamic;

public class DynamicList {

    private Node head;
    private Node tail;
    private int size;

    public int add(String value) {
        if (head == null) {
            head = new Node(value);
            tail = head;
        } else {
            Node newTail = new Node(value, tail);
            tail = newTail;
        }

        size++;
        return size;
    }

    public void printAll() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    class Node {

        String value;
        Node next;

        Node(String value, Node prevNode) {
            this.value = value;
            prevNode.next = this;
        }

        Node(String value) {
            this.value = value;
        }
    }
}
