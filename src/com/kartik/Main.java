package com.kartik;

public class Main {

    public static void main(String args[]) {
        Stack stack = new Stack(100);
        for(int i=0; true; i++){
            stack.addCar(i);
            System.out.println(stack.peep());
        }
    }
}
