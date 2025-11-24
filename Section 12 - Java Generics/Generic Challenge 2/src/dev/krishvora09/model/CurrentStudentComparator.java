package dev.krishvora09.model;

import java.util.Comparator;

public class CurrentStudentComparator implements Comparator<CurrentStudent> {

    @Override
    public int compare(CurrentStudent o1, CurrentStudent o2) {
        return (int) (o1.getPercentComplete() - o2.getPercentComplete());
    }
}
