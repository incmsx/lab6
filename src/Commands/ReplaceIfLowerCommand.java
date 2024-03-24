package Commands;
//Receiver
public class ReplaceIfLowerCommand implements Command{
    Terminal terminal;

    public ReplaceIfLowerCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.replaceIfLower();
    }
}
