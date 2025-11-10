package dev.krishvora09;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "milk", "bread"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);
    }
}
