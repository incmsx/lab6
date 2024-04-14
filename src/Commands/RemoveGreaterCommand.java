package Commands;

import Fillers.PersonGenerator;
import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;
import Managers.Parser;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

//Receiver
public class RemoveGreaterCommand implements ICommand
{
    @Override
    public String toString() {
        return "remove_greater {element} : удалить из коллекции все элементы, превышающие заданный";
    }

    @Override
    public void execute(String[] args)
    {
        Person addedPerson = PersonGenerator.generatePerson();
        List<Long> keysToRemove = new ArrayList<>();

        for(Map.Entry<Long,Person> entry: CollectionManager.getPersonCollection().entrySet())
        {
            if(addedPerson.compareTo(entry.getValue()) < 0)
            {
                keysToRemove.add(entry.getKey());
            }
        }

        for (Long key : keysToRemove)
        {
            CollectionManager.removeElement(key);
        }
    }
}
