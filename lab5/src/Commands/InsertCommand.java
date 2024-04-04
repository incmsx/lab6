package Commands;

import Interfaces.ICommand;

//Receiver
public class InsertCommand implements ICommand {
    Terminal terminal;

    public InsertCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.insert();
    }
}
