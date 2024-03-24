package Commands;

import Interfaces.ICommand;
import Managers.Terminal;

//Receiver
public class ExitCommand implements ICommand {
    Terminal terminal;

    public ExitCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.exit();
    }
}
