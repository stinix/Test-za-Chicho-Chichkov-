package com.company;

public class FirstOneHundredOddNumbers {
    public static void main(String[] args) {
        int sumnum = 0;
        for (int i = 0; i < 100; i += 1) {
            sumnum = i + i;
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
        System.out.println(sumnum);
    }
}