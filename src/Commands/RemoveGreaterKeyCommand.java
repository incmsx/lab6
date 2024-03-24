package Commands;
//Receiver
public class RemoveGreaterKeyCommand implements Command{
    Terminal terminal;

    public RemoveGreaterKeyCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.removeGreaterKey();
    }
}
