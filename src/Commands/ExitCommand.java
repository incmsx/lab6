package Commands;

import Interfaces.ICommand;
import Managers.Terminal;

//Receiver
public class ExitCommand implements ICommand {

    @Override
    public void execute()
    {
        System.exit(0);
    }

    @Override
    public String toString() {
        return "exit: завершить программу (без сохранения в файл)";
    }
}
