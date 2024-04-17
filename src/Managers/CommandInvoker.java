package Managers;


//Invoker
/**
 * Класс CommandInvoker выполняет команду, переданную в виде строки.
 */
public class CommandInvoker
{
    /**
     * Выполняет команду, переданную в виде строки.
     * @param line строка с командой и аргументами
     */
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
            System.out.println("Введите корректную команду!");
        }
    }
}
