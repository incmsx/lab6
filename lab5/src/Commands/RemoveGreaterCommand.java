package Commands;

import Interfaces.ICommand;

//Receiver
public class RemoveGreaterCommand implements ICommand {
    Terminal terminal;

    public RemoveGreaterCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.removeGreater();
    }
}
