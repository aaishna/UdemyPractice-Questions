package com.way.Array;

public class DoublyLinkedListImpl<E> {
 
    private Node head;
    private Node tail;
    private int size;
     
    public DoublyLinkedListImpl() {
        size = 0;
    }
   
    private class Node {
        E element;
        Node next;
        Node prev;
 
        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    
     
    public static void main(String a[]){
         
        DoublyLinkedListImpl<Integer> dll = new DoublyLinkedListImpl<Integer>();
       
    }
}
