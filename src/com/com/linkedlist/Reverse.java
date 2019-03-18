package com.com.linkedlist;

public class Reverse {
    private static void reverse(Node head) {
        Node ReversedHead = head;
        Node pNode = head;
        Node pPrev = null;
        while (pNode != null) {
            Node pNext = pNode.next;
            if (pNext == null) {
                ReversedHead = pNode;
            }
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        head = ReversedHead;
    }

    public static void main(String[] args) {
    }
}

class Node {
    Node next = null;
    int data;
    public Node(int data) {
        this.data = data;
    }
}
