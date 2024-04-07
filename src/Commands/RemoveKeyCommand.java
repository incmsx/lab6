package Commands;

import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;
import Managers.Parser;

import java.util.Hashtable;

//Receiver
public class RemoveKeyCommand implements ICommand {

    @Override
    public void execute(String[] args)
    {
        Long argument;
        try
        {
             argument = Long.parseLong(Parser.parseArgument(args));
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Введите правильный ключ элемента для удаления.");
            return;
        }

        Hashtable<Long, Person> personCollection = CollectionManager.getPersonCollection();

        if(personCollection.containsKey(argument))
        {
            personCollection.remove(argument);
        }
        else
        {
            System.out.printf("Элемента с ключом %s не существует \n", argument);
        }
    }
}
