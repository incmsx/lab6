package Commands;

import Interfaces.ICommand;
import Managers.Terminal;

//Receiver
public class HelpCommand implements ICommand {
    Terminal terminal;

    public HelpCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.help();
    }
    @Override public String toString()
    {
        return "help";
    }
}
