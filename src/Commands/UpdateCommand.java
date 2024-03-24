package Commands;
//Receiver
public class UpdateCommand implements Command{
    Terminal terminal;

    public UpdateCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.insert();
    }
}
