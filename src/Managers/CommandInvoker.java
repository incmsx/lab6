package Managers;

import Exceptions.WrongCommandException;
import Interfaces.ICommand;

//Inovoker
public class CommandInvoker
{
    public static void execute(String line)
    {
        String commandName = CommandSelector.parseCommand(line);
        try
        {
            CommandSelector.getCommand(commandName).execute();
        }
        catch (NullPointerException e)
        {
            System.out.println("Введите корректную команду!");
        }
    }
}
