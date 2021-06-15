package com;

public class Loop {
    public void printAllNums(int start, int end) {
        int a = start;
        while(a <= end) {
            System.out.println(a);
            a++;
        }
    }
    public void printEvenNums(int start, int end) {
        for(int i= start; i <= end; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
