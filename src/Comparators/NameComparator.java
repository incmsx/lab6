package Comparators;

import InputData.Person;

import java.util.Comparator;

public class NameComparator implements Comparator<Person>
{
    @Override
    public int compare(Person o1, Person o2)
    {
        return o1.getName().length() - o2.getName().length();
    }
    @Override
    public Comparator<Person> reversed() {
        return Comparator.super.reversed();
    }

}
