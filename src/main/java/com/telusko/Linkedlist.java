package com.telusko;

import java.lang.*;
import java.util.Arrays;

class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class Linkedlist {
    Node head;
    Node tail;
    int size;
    public Linkedlist(){
        head = null;
        tail = null;
    }
    public void add(Node newnode){
        if(head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        Node n1 = new Node(10);
        Node n2 = new Node(20);

        ll.add(n1);
        ll.add(n2);

        ll.print();
        System.out.println(ll.size);
    }

}
