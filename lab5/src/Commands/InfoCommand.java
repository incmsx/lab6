package Commands;

import Interfaces.ICommand;
import Managers.Terminal;

//Receiver
public class InfoCommand implements ICommand {
    Terminal terminal;

    public InfoCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.info();
    }
}
