package Commands;

import Interfaces.ICommand;
import Managers.CollectionManager;

//Receiver
public class RemoveKeyCommand implements ICommand {

    @Override
    public void execute(String argument, String element)
    {
        CollectionManager.getPersonCollection();
    }
}
