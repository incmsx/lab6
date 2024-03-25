package Commands;

import Interfaces.ICommand;
import Managers.Terminal;

//Receiver
public class ExecuteScriptCommand implements ICommand {
    Terminal terminal;

    public ExecuteScriptCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.executeScript();
    }
}
