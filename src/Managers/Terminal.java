package Managers;

import Commands.HelpCommand;
import Interfaces.ICommand;

import java.util.Hashtable;

//Receiver
public class Terminal {

//    public Hashtable<String, ICommand> getCommandsCollection()
//    {
//        Hashtable<String, ICommand> commands = new Hashtable<>();
//        commands.put("help",new HelpCommand(this));
//        return commands;
//    }
    public void help()
    {
        System.out.println("Ничем не могу помочь...");
    }
    public void info()
    {

    }
    public void show(){}
    public void insert(){}
    public void update(){}
    public void removeKey(){}
    public void clear(){}
    public void save(){}
    public void executeScript(){}
    public void exit(){}
    public void removeGreater(){}
    public void replaceIfLower(){}
    public void removeGreaterKey(){}
    public void maxByName(){}
    public void filterGreaterThenHeight(){}
    public void printDescending(){}

}
