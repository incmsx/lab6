package Commands;
//Receiver
public class ExitCommand implements Command{
    Terminal terminal;

    public ExitCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.exit();
    }
}
