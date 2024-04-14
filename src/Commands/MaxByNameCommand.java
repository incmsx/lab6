package Commands;

import Comparators.NameComparator;
import Interfaces.ICommand;
import Managers.CollectionManager;

import java.util.Hashtable;

//Receiver
public class MaxByNameCommand implements ICommand
{
    @Override
    public void execute(String[] args)
    {
        System.out.println(CollectionManager.getPersonCollection().values().stream().max(new NameComparator()));
    }

    @Override
    public String toString() {
        return "max_by_name : вывести любой объект из коллекции, " +
                "значение поля name которого является максимальным";
    }
}
