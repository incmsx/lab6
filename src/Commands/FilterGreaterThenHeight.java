package Commands;

import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;
import Managers.Parser;

import java.util.Hashtable;
import java.util.Map;

//Receiver
public class FilterGreaterThenHeight implements ICommand {
    @Override
    public void execute(String[] args)
    {
        Hashtable<Long, Person> personTable = CollectionManager.getPersonCollection();
        try
        {
            Integer height = Integer.valueOf(Parser.parseArgument(args));
            for (Map.Entry<Long, Person> entry : personTable.entrySet())
            {
                if (entry.getValue().getHeight() > height)
                {
                    System.out.println(entry.getValue().toString());
                }
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Height элемента введена неправильно. ");
        }
    }
}
