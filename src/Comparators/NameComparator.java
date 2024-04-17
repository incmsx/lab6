package Comparators;

import InputData.Person;

import java.util.Comparator;

public class NameComparator implements Comparator<Person>
{
    /**
     Сравнивает два объекта типа Person по длине их имен.
     @param o1 Первый объект типа Person для сравнения.
     @param o2 Второй объект типа Person для сравнения.
     @return Результат сравнения: отрицательное значение, если длина имени o1 меньше длины имени o2, ноль, если они равны, и положительное значение, если длина имени o1 больше длины имени o2.
     */
    @Override
    public int compare(Person o1, Person o2)
    {
        return o1.getName().length() - o2.getName().length();
    }

    /**
     Возвращает обратный компаратор для данного компаратора.
     @return Обратный компаратор для данного компаратора.
     */
    @Override
    public Comparator<Person> reversed() {
        return Comparator.super.reversed();
    }

}