package com.datastructures;

/**
 * @author Harshal Patil
 * Resizable implementation of Stack(FILO) data structure.
 */
public class Stack {

    /**
     * Current index of the array
     */
    int top = 0;

    /**
     * The array in which the data to be store.
     */
    Object[] elements = new Object[]{0, 0};

    /**
     * The maximum size of array to allocate.
     */
    private static final int ARRAY_SIZE = 20;

    /**
     * Object pushed in Stack
     * @param input
     */
    public void push(Object input) {
        if(null != input)
            elements[top] = input;
            resizeArray();
            top++;
    }

    /**
     * Object popped out from the stack
     */
    public void pop() {
        if(top == 0) {
            System.out.println("Stack is empty");
        } else {
            elements[top] = null;
            top--;
        }
    }

    /**
     * Initialise array with default value
     */
    public void clear() {
        elements = new Object[ARRAY_SIZE];
        top = 0;
    }

    /**
     * Increased size of array depending on the inputs
     */
    private void resizeArray() {
        if(top == elements.length-1){
            Object newArray[] = new Object[elements.length + 2];
            int i = 0;
            for(Object value: elements) {
                newArray[i] = value;
                i++;
            }
            elements = newArray;
        }
    }

}
