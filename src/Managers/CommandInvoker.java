package Managers;


//Invoker
public class CommandInvoker
{
    public static void execute(String line)
    {
        String commandName = Parser.parseCommand(line);
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
