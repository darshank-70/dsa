package com.example.linked_lists;

import com.example.linked_lists.base.SinglyLinkedList;

public class LinkedListsMain {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addAtTail(1);
//        list.addAtTail(2);
//        list.addAtTail(3);
//        list.addAtHead(-1);
//        list.addAtHead(-2);
        //creates a list like -2 -> -1 -> 1 -> 2 -> 3 ->
//       index becomes         0     1    2    3    4
        list.print();
//        System.out.println(list.get(2).val + " should be 1");
//        list.deleteAt(0);
//        list.print();
//        list.deleteAtHead();
//        list.print();
//        list.addAtIndex(0,0);
//        list.print();
        list.reverse();
    }
}
