package Commands;
//Receiver
public class FilterGreaterThenHeight implements Command{
    Terminal terminal;

    public FilterGreaterThenHeight(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.filterGreaterThenHeight();
    }
}
