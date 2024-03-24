package Commands;
//Receiver
public class RemoveKeyCommand implements Command{
    Terminal terminal;

    public RemoveKeyCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.removeKey();
    }
}
