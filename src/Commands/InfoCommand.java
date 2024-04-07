package Commands;

import Interfaces.ICommand;
import Managers.CollectionManager;

//Receiver
public class InfoCommand implements ICommand {

    @Override
    public void execute(String argument, String element)
    {
        System.out.println("Тип: "+CollectionManager.getPersonCollection().getClass().getSimpleName());
        System.out.println("Дата инициализации: " + CollectionManager.getInitilizationDate());
        System.out.println("Количество элементов: " + CollectionManager.getPersonCollection().size());

    }
}
