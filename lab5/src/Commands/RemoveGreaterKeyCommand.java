package Commands;

import Interfaces.ICommand;

//Receiver
public class RemoveGreaterKeyCommand implements ICommand {
    Terminal terminal;

    public RemoveGreaterKeyCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.removeGreaterKey();
    }
}
