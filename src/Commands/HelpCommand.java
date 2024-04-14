package Commands;

import Interfaces.ICommand;
import Managers.CommandSelector;

//Receiver
public class HelpCommand implements ICommand {

    @Override
    public void execute(String[] args)
    {
        for (ICommand command : CommandSelector.getCommandsCollection().values())
        {
            System.out.println(command);
        }
    }
    @Override public String toString()
    {
        return "help : вывести справку по доступным командам";
    }
}
