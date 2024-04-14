package Commands;

import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;
import Managers.Parser;

import java.util.*;

//Receiver
public class RemoveGreaterKeyCommand implements ICommand {
    @Override
    public void execute(String[] args)
    {
        Hashtable<Long, Person> personTable = CollectionManager.getPersonCollection();

        try
        {
            Long argKey = Long.valueOf(Parser.parseArgument(args));

            Set<Long> keys = personTable.keySet();
            List<Long> keysToRemove = new ArrayList<>();
            for (Long key : keys)
            {
                if (argKey < key)
                {
                    keysToRemove.add(key);
                    System.out.printf("Объект с ключом %s удален. \n", key);
                }
            }
            for (Long key : keysToRemove)
            {
                personTable.remove(key);
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Ключ элемента введена неправильно. ");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Ключ элемента не введен. ");
        }
    }
}
