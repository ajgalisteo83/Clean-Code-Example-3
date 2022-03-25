package com.programandotv;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>();
        ArrayList<Integer> secondList = new ArrayList<Integer>();
        ArrayList<Integer> thirdList = new ArrayList<Integer>();

        for (int i=0;i<10;i++) {
            myList.add((int)(Math.random()*50+1));
        }

        for (int value: myList) {
            if (value % 2 == 0) {
                secondList.add(value);
            } else {
                thirdList.add(value);
            }
        }

        System.out.println("Second List content: ");
        for (int value: secondList) {
            System.out.println(value);
        }

        System.out.println("Third List content: ");
        for (int value: thirdList) {
            System.out.println(value);
        }

    }
}
