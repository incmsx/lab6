package Commands;
//Receiver
public class ExecuteScriptCommand implements Command{
    Terminal terminal;

    public ExecuteScriptCommand(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void execute() {
        terminal.executeScript();
    }
}
