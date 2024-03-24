package Commands;
//Receiver
public class ClearCommand implements Command{
    Terminal terminal;

    public ClearCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.clear();
    }
}
