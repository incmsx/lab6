package Commands;
//Receiver
public class HelpCommand implements Command{
    Terminal terminal;

    public HelpCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.help();
    }
}
