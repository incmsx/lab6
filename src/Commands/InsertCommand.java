package Commands;

import Fillers.PersonGenerator;
import Interfaces.ICommand;
import Managers.Parser;

//Receiver
public class InsertCommand implements ICommand {


    @Override
    public String toString() {
        return "insert null {element} : добавить новый элемент с заданным ключом";
    }

    @Override
    public void execute(String[] args)
    {
        try
        {
            Long key = Long.valueOf(Parser.parseArgument(args));
            PersonGenerator.generatePerson(key);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Ключ элемента введен неправильно. ");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Ключ элемента не введен. ");
        }

    }
}
