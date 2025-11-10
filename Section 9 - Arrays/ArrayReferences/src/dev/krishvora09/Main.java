package dev.krishvora09;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        int[] copyArray = Arrays.copyOf(myIntArray, myIntArray.length);

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        System.out.println("copyArray = " + Arrays.toString(copyArray));

        myIntArray[3] = 7;
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));
        System.out.println("copyArray = " + Arrays.toString(copyArray));
    }
}
