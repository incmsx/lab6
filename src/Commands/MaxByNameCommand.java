package Commands;
//Receiver
public class MaxByNameCommand implements Command{
    Terminal terminal;

    public MaxByNameCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.maxByName();
    }
}
