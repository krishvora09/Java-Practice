package dev.krishvora09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] intArray = readIntegers();
        int minValue = getMinimum(intArray);

        System.out.println("Minimum value in array is: " + minValue);
    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");

        String input = scanner.nextLine();
        String[] intArray = input.split(",");
        int[] values = new int[intArray.length];

        for (int i = 0; i < intArray.length; i++) {
            values[i] = Integer.parseInt(intArray[i].trim());
        }

        return values;
    }

    private static int getMinimum(int[] array) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }

        return min;
    }
}
