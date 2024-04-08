package Commands;

import Fillers.KeyGenerator;
import Fillers.PersonGenerator;
import Interfaces.ICommand;
import Managers.Parser;

//Receiver
public class InsertCommand implements ICommand {


    @Override
    public void execute(String[] args)
    {
        Long key = Long.valueOf(Parser.parseArgument(args));
        PersonGenerator.generatePerson(key);
    }
}
