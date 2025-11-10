package dev.krishvora09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);
        System.out.println(originalArray);
        System.out.println(originalList);

        originalList.set(0, "one");
        System.out.println("List: " + originalList);
        System.out.println("Array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("Array: " + Arrays.toString(originalArray));
//        originalList.add("Fourth");
//        System.out.println(originalList);

        List<String> newList = Arrays.asList("Sunday", "Monday");
//        newList.add("Tuesday");
        System.out.println(newList);

        ArrayList<String> stringLists = new ArrayList<>(List.of("Jan", "Feb", "Mar"));
        String[] stringArray = stringLists.toArray(new String[5]);

        System.out.println(Arrays.toString(stringArray));
        stringArray[0] = "Apr";
        System.out.println("Array: " + Arrays.toString(stringArray));
        System.out.println("List: " + stringLists);

    }
}
