package dev.krishvora09;

import dev.krishvora09.model.CurrentStudent;
import dev.krishvora09.model.CurrentStudentComparator;
import dev.krishvora09.util.QueryList;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        QueryList<CurrentStudent> queryList = new QueryList<>();
        for (int i = 0; i < 25; i++) {
            queryList.add(new CurrentStudent());
        }

        System.out.println("Ordered");
        queryList.sort(Comparator.naturalOrder());
        printList(queryList);

        System.out.println("Matches");
        var matches = queryList.
                getMatches("PercentComplete", "50")
                .getMatches("Course", "Python");

        matches.sort(new CurrentStudentComparator());
        printList(matches);

        System.out.println("Ordered");
        matches.sort(null);
        printList(matches);
    }

    public static void printList(List<?> students) {

        for (var student: students) {
            System.out.println(student);
        }
    }
}
