package Commands;
//Receiver
public class ShowCommand implements Command{
    Terminal terminal;

    public ShowCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.show();
    }
}
