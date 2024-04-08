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
        Long key;
        try
        {
             key = Long.parseLong(Parser.parseArgument(args));
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Введите правильный ключ элемента для удаления.");
            return;
        }

        CollectionManager.removeElement(key);
    }
}
