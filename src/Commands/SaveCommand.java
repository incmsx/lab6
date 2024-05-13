package Commands;

import Interfaces.ICommand;
import Managers.CollectionManager;
import Managers.FileHandler;
import com.thoughtworks.xstream.XStream;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

//Receiver
public class SaveCommand implements ICommand {

    XStream xStream = new XStream();

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
            writer.println(xStream.toXML(CollectionManager.getPersonCollection()));
            writer.close();
            System.exit(0);
        } catch (FileNotFoundException e)
        {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
