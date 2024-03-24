package Commands;

import Interfaces.ICommand;
import Managers.Terminal;

//Receiver
public class ShowCommand implements ICommand {
    Terminal terminal;

    public ShowCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.show();
    }
}
