package Managers;


//Invoker
public class CommandInvoker
{
    public static void execute(String line)
    {

        try
        {
            String commandName = Parser.parseCommand(line);
            String[] args = Parser.parseInputLine(line);
            CommandSelector.getCommand(commandName).execute(args);
        }
        catch (NullPointerException e)
        {
            System.out.println("Введите корректную команду!");
        }
    }
}
