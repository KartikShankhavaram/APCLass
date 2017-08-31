package com.kartik;

public class Stack {

    int stack[];
    int top, size;

    public Stack(int size) {

        this.size = size;
        stack = new int[size];
        top = -1;

    }

    public Stack() {

        stack = new int[10];
        size = 10;
        top = -1;

    }

    public void addCar(int val) {
        if (!isFull()) {
            stack[++top] = val;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int removeTopCar(){

        if(isEmpty()){
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        int v = stack[top--];
        return v;
    }

    public boolean isEmpty(){
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if(top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public int peep() {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            System.exit(0);
        }
        int v = stack[top];
        return v;
    }

}