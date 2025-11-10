package dev.krishvora09;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {13, 5, 17, 19, 21, 32};
        System.out.println("Array before reversing: " + Arrays.toString(array));

        reverse(array);
        System.out.println("Array after reversing: " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {

        int i=0, j=array.length-1;
        int temp;

        while(i<=j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}

