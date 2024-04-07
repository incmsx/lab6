package Commands;

import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;

import java.util.Hashtable;

//Receiver
public class ClearCommand implements ICommand {

    @Override
    public void execute(String args, String elem)
    {
        CollectionManager.getPersonCollection().clear();
        CollectionManager.setInitilizationDate(null);
    }
}
