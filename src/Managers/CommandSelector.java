package Managers;

import Commands.*;
import Interfaces.ICommand;
import java.util.Hashtable;
import java.util.NoSuchElementException;


// Invoker
public class CommandSelector
{
    static Terminal terminal = new Terminal();

    public static ICommand getCommand(String commandName) throws NullPointerException
    {
        ICommand command = null;
        Hashtable<String,ICommand> commandCollection = getCommandsCollection();
        for (String key : commandCollection.keySet())
        {
            if (key.equals(commandName.toLowerCase()))
            {
                command = commandCollection.get(key);
                return command;
            }
        }
        return command;
    }

    public static Hashtable<String, ICommand> getCommandsCollection()
    {
        Hashtable<String, ICommand> commands = new Hashtable<>();

        commands.put("help",new HelpCommand());
        commands.put("info",new InfoCommand(terminal));
        commands.put("show",new ShowCommand(terminal));
        commands.put("insert",new InsertCommand(terminal));
        commands.put("update",new UpdateCommand(terminal));
        commands.put("remove_key",new RemoveKeyCommand(terminal));
        commands.put("clear",new ClearCommand(terminal));
        commands.put("execute_script",new ExecuteScriptCommand(terminal));
        commands.put("save",new SaveCommand(terminal));
        commands.put("exit",new ExitCommand());
        commands.put("remove_greater",new RemoveGreaterCommand(terminal));
        commands.put("replace_if_lower",new ReplaceIfLowerCommand(terminal));
        commands.put("remove_greater_key",new RemoveGreaterKeyCommand(terminal));
        commands.put("max_by_name",new MaxByNameCommand(terminal));
        commands.put("filter_greater_then_height",new FilterGreaterThenHeight(terminal));
        commands.put("print_descending",new PrintDescending(terminal));

        return commands;
    }
}
