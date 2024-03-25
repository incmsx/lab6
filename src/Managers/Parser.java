package Managers;

public class Parser
{
    public static String parseCommand(String line)
    {
        String commandName = "";
        try
        {
            String[] wordsInLine = line.split(" ");
            commandName = wordsInLine[0];
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Нужно команду ввести!");
        }
        return commandName;
    }
}
