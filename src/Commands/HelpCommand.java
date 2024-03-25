package Commands;

import Interfaces.ICommand;
import Managers.Terminal;

//Receiver
public class HelpCommand implements ICommand {

    @Override
    public void execute()
    {
        System.out.println("Ничем не могу помочь...");
    }
    @Override public String toString()
    {
        return "help";
    }
}
