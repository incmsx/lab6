package Commands;

import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;

import java.util.Hashtable;

//Receiver
public class InfoCommand implements ICommand {

    @Override
    public String toString() {
        return "info : вывести в стандартный поток вывода информацию о коллекции " +
                "(тип, дата инициализации, количество элементов и т.д.)";
    }

    @Override
    public void execute(String[] args)
    {
        System.out.println("Тип: "+CollectionManager.getPersonCollection().getClass().getSimpleName());
        System.out.println("Дата инициализации: " + CollectionManager.getInitilizationDate());
        System.out.println("Количество элементов: " + CollectionManager.getPersonCollection().size());

        CollectionManager.showCollection();

    }
}
