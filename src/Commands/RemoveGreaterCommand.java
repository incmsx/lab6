package Commands;
//Receiver
public class RemoveGreaterCommand implements Command{
    Terminal terminal;

    public RemoveGreaterCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.removeGreater();
    }
}
