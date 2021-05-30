package com.datastructures;

/**
 * @author Harshal Patil
 * Resizable implementation of Singly linked list data structure.
 */
public class LinkedList {

    /**
     * Default capacity of array.
     */
    private static int size = 0;

    /**
     * Represent head of list
     */
    Node head;

    /**
     * Method to add/liked data in list
     * @param data
     */
    public void add(Object data) {
        if(null == head) {
            head = new Node(data);
            return;
        }

        Node tempNode = new Node(data);
        Node current = head;

        if(current != null) {
            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(tempNode);
        }
        incrementSize();
    }

    /**
     * Increment LinkedList size on every add
     */
    public static void incrementSize() {
        size++;
    }

    /**
     * Return size of LinkedList
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * Node Object to hold data of list
     */
    private static class Node {
        Node next;

        Object data;

        /**
         * Parameterize constructor of Node
         * @param value
         */
        public Node(Object value) {
            this.data = value;
            this.next = null;
        }

        /**
         * Return current node
         * @return
         */
        public Node getNext() {
            return next;
        }

        /**
         * Set next node
         * @param next
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
