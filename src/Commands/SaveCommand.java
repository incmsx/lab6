package Commands;

import Interfaces.ICommand;
import Managers.CollectionManager;
import Managers.FileHandler;
import com.thoughtworks.xstream.*;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

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
        try (PrintWriter writer = new PrintWriter(FileHandler.getFile()))
        {
            writer.println();
        } catch (FileNotFoundException e)
        {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
