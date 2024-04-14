package Comparators;

import InputData.Person;

import java.util.Comparator;

public class IdComparator implements Comparator<Person>
{
    @Override
    public int compare(Person o1, Person o2) {
        return (int) (o1.getId() - o2.getId());
    }

    @Override
    public Comparator<Person> reversed() {
        return Comparator.super.reversed();
    }
}
