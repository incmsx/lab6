package Commands;

import Interfaces.ICommand;

//Receiver
public class ClearCommand implements ICommand {
    Terminal terminal;

    public ClearCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.clear();
    }
}
