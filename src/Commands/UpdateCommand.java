package Commands;

import Fillers.PersonGenerator;
import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;
import Managers.Parser;

import java.util.Hashtable;
import java.util.Map;

//Receiver
public class UpdateCommand implements ICommand {


    @Override
    public void execute(String[] args)
    {
        Hashtable<Long, Person> personTable = CollectionManager.getPersonCollection();
        try
        {
            Long targetId = Long.valueOf(Parser.parseArgument(args));
            for (Map.Entry<Long, Person> entry : personTable.entrySet())
            {
                if (entry.getValue().getId() == targetId)
                {
                    Person person = PersonGenerator.generatePerson();
                    person.setId(targetId);
                    CollectionManager.addToCollection(person, entry.getKey());
                }
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Id элемента введен неправильно. ");
        }

    }
}
