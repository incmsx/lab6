package Managers;

//Inovoker
public class CommandInvoker
{
    CommandSelector selector;

    public CommandInvoker(CommandSelector selector) {
        this.selector = selector;
    }

    public void Execute(String line)
    {
        selector.getCommand(line).execute();
    }
}
