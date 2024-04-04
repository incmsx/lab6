package Commands;

import Interfaces.ICommand;

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
