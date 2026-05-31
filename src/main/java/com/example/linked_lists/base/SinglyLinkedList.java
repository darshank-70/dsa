package com.example.linked_lists.base;

public class SinglyLinkedList {
    SinglyListNode head;
    int size;

    //constructor 
    public SinglyLinkedList(){
        head = new SinglyListNode(0);
        //just create a dummy Node
    }


//    get List
    public SinglyListNode get(){
        return head.next;
    }
// h
// ^ 
//1 -> 2 -> 3 -> 4 ->
// size = 4
// index = 3
    /// get at index
    public SinglyListNode get(int index){
        if(index < 0 || index == size) {
            return null;
        }
        SinglyListNode temp = head.next;
        while(temp != null && index-- != 0){
            temp = temp.next;
        }
        return temp;
    }
    //add at head
    public SinglyListNode addAtHead(int val){
        
        SinglyListNode newNode = new SinglyListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        size++;
        return head.next;
    }
    //add at tail
    public SinglyListNode addAtTail(int val){
        SinglyListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new SinglyListNode(val);
        size++;
        return head.next;
    }

    //no new node; head -> dummy -> null ;      addAt(0
    //1 node:      head -> dummy -> 1 -> null   addAt(0
    //add at index
    public SinglyListNode addAtIndex(int val, int index){
        if(index < 0 || index == size) return null;
        SinglyListNode newNode = new SinglyListNode(val);
        SinglyListNode temp = head, prev = null;

        while(temp != null && index-- >= 0){
            prev = temp;
            temp = temp.next;
        }
        prev.next = newNode;
        newNode.next = temp;
        size++;
        return head.next;
    }

// 1 -> 2 -> 3 -> 4 -> 
    //deelte at head
    public SinglyListNode deleteAtHead(){
        head = head.next;
        return head;
    }


    //delete at tail
    public SinglyListNode deleteAtTail(){
        SinglyListNode temp = head;
        SinglyListNode prev = null;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return head.next;
    }
    //delete at index
    public SinglyListNode deleteAt(int index){
        if(index < 0 || index == size) return null;
        SinglyListNode temp = head.next, prev = head;
        while(temp != null && index-- != 0){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp.next = null;
        return head.next;
    }

    //print all nodes
    public void print(){
        SinglyListNode temp = head.next;
        while(temp != null){
            System.out.print(temp.val + "=>");
            temp = temp.next;
        }
        System.out.println();
    }

//    head: dummy -> 1 -> 2 -> 3 -> 4 ->null
//
    public SinglyListNode reverse(){
        if(head.next == null) return head;

        //since we have dummy node pointing, so we have to start from the head.nect
        SinglyListNode current = head.next, prev = null,next;
        //"Process while current exists" this is what we want
//        Not "while current has next"
        //bevcause we are reversing pointer to which current is pointing

        while(current != null){
            next = current.next; //save the next temporarily
            current.next = prev; // reverse the current pointer to point prev Node
            prev = current; // move the prev
            current = next;// move the current
            //prev becomes the new head
        }
        head.next = prev;
        print();
        return prev;
    }
}
