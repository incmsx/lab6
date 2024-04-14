package Commands;

import Interfaces.ICommand;

//Receiver
public class SaveCommand implements ICommand {

    @Override
    public String toString()
    {
        return "save : сохранить коллекцию в файл";
    }

    @Override
    public void execute(String[] args)
    {

    }
}
