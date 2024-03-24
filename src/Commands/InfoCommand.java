package Commands;
//Receiver
public class InfoCommand implements Command{
    Terminal terminal;

    public InfoCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.info();
    }
}
