package Commands;

import Interfaces.ICommand;
import Managers.Terminal;

//Receiver
public class FilterGreaterThenHeight implements ICommand {
    Terminal terminal;

    public FilterGreaterThenHeight(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.filterGreaterThenHeight();
    }
}
