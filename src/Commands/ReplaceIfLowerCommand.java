package Commands;

import Fillers.PersonGenerator;
import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;
import Managers.Parser;

//Receiver
public class ReplaceIfLowerCommand implements ICommand {

    @Override
    public void execute(String[] args)
    {

        try
        {
            Long key = Long.valueOf(Parser.parseArgument(args));
            Person addedPerson = PersonGenerator.generatePerson();

            if(!CollectionManager.getPersonCollection().containsKey(key))
            {
                System.out.println("Элемента с таким ключом не существует.");
                return;
            }

            if(CollectionManager.getPersonCollection().get(key).compareTo(addedPerson) < 0)
            {
                System.out.println("Новое значение больше старого.");
                return;
            }
            else if (CollectionManager.getPersonCollection().get(key).compareTo(addedPerson) == 0)
            {
                System.out.println("Новое значение равно старому.");
                return;
            }

            CollectionManager.getPersonCollection().replace(key, addedPerson);

        }
        catch (NumberFormatException e)
        {
            System.out.println("Ключ введен неверно.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Ключ не введен.");
        }
    }
}
