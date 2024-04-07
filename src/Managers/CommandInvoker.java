package Managers;


//Invoker
public class CommandInvoker
{
    public static void execute(String line)
    {

        try
        {
            String commandName = Parser.parseCommand(line);
            String argument = Parser.parseArgument(line);
            String element = Parser.parseElement(line);
            CommandSelector.getCommand(commandName).execute(argument, element);
        }
        catch (NullPointerException e)
        {
            System.out.println("Введите корректную команду!");
        }
    }
}
