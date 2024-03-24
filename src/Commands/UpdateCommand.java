package Commands;

import Interfaces.ICommand;
import Managers.Terminal;

//Receiver
public class UpdateCommand implements ICommand {
    Terminal terminal;

    public UpdateCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.update();
    }
}
