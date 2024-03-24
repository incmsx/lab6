package Commands;
//Receiver
public class InsertCommand implements Command{
    Terminal terminal;

    public InsertCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.insert();
    }
}
