package Managers;


//Invoker
public class CommandInvoker
{
    public static void execute(String line)
    {
        String[] args = new String[0];
        try
        {
            String commandName = Parser.parseCommand(line);
            args = Parser.parseInputLine(line);
            CommandSelector.getCommand(commandName).execute(args);
        }
        catch (NullPointerException e)
        {
            for (String arg: args)
            {
                System.out.println(arg);
            }
            System.out.println("Введите корректную команду!");
        }
    }
}
