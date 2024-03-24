package Commands;
//Receiver
public class PrintDescending implements Command{
    Terminal terminal;

    public PrintDescending(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.printDescending();
    }
}
