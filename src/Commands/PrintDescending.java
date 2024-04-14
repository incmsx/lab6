package Commands;

import Comparators.IdComparator;
import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;

import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Stream;

//Receiver
public class PrintDescending implements ICommand {

    @Override
    public String toString() {
        return "print_descending : вывести элементы коллекции в порядке убывания";
    }

    @Override
    public void execute(String[] args)
    {
        Hashtable<Long, Person> personHashtable = CollectionManager.getPersonCollection();
        Stream<Person> sorted = personHashtable.values().stream().sorted(new IdComparator().reversed());
        sorted.forEach(System.out::println);
    }
}
