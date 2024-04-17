package Comparators;

import InputData.Person;

import java.util.Comparator;

public class IdComparator implements Comparator<Person> {
    /**
     * Сравнивает два объекта типа Person по их идентификаторам.
     *
     * @param o1 Первый объект типа Person для сравнения.
     * @param o2 Второй объект типа Person для сравнения.
     * @return Результат сравнения: отрицательное значение, если o1 меньше o2, ноль, если они равны, и положительное значение, если o1 больше o2.
     */
    @Override
    public int compare(Person o1, Person o2) {
        return (int) (o1.getId() - o2.getId());
    }

    /**
     * Возвращает обратный компаратор для данного компаратора.
     *
     * @return Обратный компаратор для данного компаратора.
     */
    @Override
    public Comparator<Person> reversed() {
        return Comparator.super.reversed();
    }
}
