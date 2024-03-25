package Commands;

import Interfaces.ICommand;
import Managers.Terminal;

//Receiver
public class MaxByNameCommand implements ICommand {
    Terminal terminal;

    public MaxByNameCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.maxByName();
    }
}
