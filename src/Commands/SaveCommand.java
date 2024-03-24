package Commands;
//Receiver
public class SaveCommand implements Command{
    Terminal terminal;

    public SaveCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.save();
    }
}
