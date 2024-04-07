package Managers;

import Commands.*;
import Interfaces.ICommand;
import java.util.Hashtable;

public class CommandSelector
{
    public static ICommand getCommand(String commandName) throws NullPointerException
    {
        ICommand command;
        Hashtable<String,ICommand> commandCollection = getCommandsCollection();
        for (String key : commandCollection.keySet())
        {
            if (key.equals(commandName.toLowerCase()))
            {
                command = commandCollection.get(key);
                return command;
            }
        }
        return null;
    }

    private static Hashtable<String, ICommand> getCommandsCollection()
    {
        Hashtable<String, ICommand> commands = new Hashtable<>();

        commands.put("help",new HelpCommand());
        commands.put("info",new InfoCommand());
        commands.put("show",new ShowCommand());
        commands.put("insert",new InsertCommand());
        commands.put("update",new UpdateCommand());
        commands.put("remove_key",new RemoveKeyCommand());
        commands.put("clear",new ClearCommand());
        commands.put("execute_script",new ExecuteScriptCommand());
        commands.put("save",new SaveCommand());
        commands.put("exit",new ExitCommand());
        commands.put("remove_greater",new RemoveGreaterCommand());
        commands.put("replace_if_lower",new ReplaceIfLowerCommand());
        commands.put("remove_greater_key",new RemoveGreaterKeyCommand());
        commands.put("max_by_name",new MaxByNameCommand());
        commands.put("filter_greater_then_height",new FilterGreaterThenHeight());
        commands.put("print_descending",new PrintDescending());

        return commands;
    }
}
