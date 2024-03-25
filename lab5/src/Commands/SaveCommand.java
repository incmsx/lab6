package Commands;

import Interfaces.ICommand;
import Managers.Terminal;

//Receiver
public class SaveCommand implements ICommand {
    Terminal terminal;

    public SaveCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.save();
    }
}
