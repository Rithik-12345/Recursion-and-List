package com.telusko;

import java.util.ArrayList;
import java.util.List;

class Node1{
    int data;
    Node1 next;
    Node1 prev;
    public Node1(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class Linkedlist1{
    Node1 head = null;
    Node1 tail = null;
    public Linkedlist1(){
        this.head=null;
        this.tail=null;
    }
    public void addNode(Node1 newnode){
        if(head==null && tail==null){
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            newnode.prev = tail;
            newnode.next = null;
            tail = newnode;
        }
    }

    public void print(){
        Node1 temp =this.head;
        while(head!=null){
            System.out.print(temp.data+"");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Linkedlist1 list = new Linkedlist1();
        Node1 n1 = new Node1(1);
        Node1 n2 = new Node1(2);

        list.addNode(n1);
        list.addNode(n2);

        list.print();
    }

}