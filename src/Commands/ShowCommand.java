package Commands;

import Interfaces.ICommand;
import Managers.CollectionManager;

//Receiver
public class ShowCommand implements ICommand {

    @Override
    public String toString() {
        return "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }

    @Override
    public void execute(String[] args)
    {
        CollectionManager.showCollection();
    }
}
