package Managers;

import Commands.*;
import Interfaces.ICommand;

import java.util.Hashtable;

// Invoker
public class CommandSelector
{
    public ICommand getCommand(String line)
    {
        String[] wordsInLine = line.split(" ");
        String commandName = wordsInLine[0];
        ICommand command = null;
        Terminal terminal = new Terminal();

        switch (commandName.toLowerCase())
        {
            case "help" -> command = new HelpCommand(terminal);
            case "info" -> command = new InfoCommand(terminal);
            case "show" -> command = new ShowCommand(terminal);
            case "insert" -> command = new InsertCommand(terminal);
            case "update" -> command = new UpdateCommand(terminal);
            case "remove_key" -> command = new RemoveKeyCommand(terminal);
            case "clear" -> command = new ClearCommand(terminal);
            case "save" -> command = new SaveCommand(terminal);
            case "execute_script" -> command = new ExecuteScriptCommand(terminal);
            case "exit" -> command = new ExitCommand(terminal);
            case "remove_greater" -> command = new RemoveGreaterCommand(terminal);
            case "replace_if_lower" -> command = new ReplaceIfLowerCommand(terminal);
            case "remove_greater_key" -> command = new RemoveGreaterKeyCommand(terminal);
            case "max_by_name" -> command = new MaxByNameCommand(terminal);
            case "filter_greater_then_height" -> command = new FilterGreaterThenHeight(terminal);
            case "print_descending" -> command = new PrintDescending(terminal);
        }
        return command;
    }
}
