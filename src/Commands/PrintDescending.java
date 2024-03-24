package Commands;

import Interfaces.ICommand;
import Managers.Terminal;

//Receiver
public class PrintDescending implements ICommand {
    Terminal terminal;

    public PrintDescending(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.printDescending();
    }
}
