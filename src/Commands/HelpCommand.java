package Commands;

import Interfaces.ICommand;

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
