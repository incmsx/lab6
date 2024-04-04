package Commands;

import Interfaces.ICommand;

//Receiver
public class ReplaceIfLowerCommand implements ICommand {
    Terminal terminal;

    public ReplaceIfLowerCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.replaceIfLower();
    }
}
