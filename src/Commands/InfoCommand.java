package Commands;

import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;

import java.util.Hashtable;

//Receiver
/**
 * Класс InfoCommand реализует интерфейс ICommand и представляет команду вывода информации о коллекции.
 */
public class InfoCommand implements ICommand {

    /**
     * Возвращает описание команды в виде строки.
     * @return Описание команды вывода информации о коллекции.
     */
    @Override
    public String toString() {
        return "info : вывести в стандартный поток вывода информацию о коллекции " +
                "(тип, дата инициализации, количество элементов и т.д.)";
    }

    /**
     * Выполняет команду вывода информации о коллекции.
     * @param args Массив строковых аргументов. Не используется в данной команде.
     */
    @Override
    public void execute(String[] args)
    {
        System.out.println("Тип: "+CollectionManager.getPersonCollection().getClass().getSimpleName());
        System.out.println("Дата инициализации: " + CollectionManager.getInitilizationDate());
        System.out.println("Количество элементов: " + CollectionManager.getPersonCollection().size());

        CollectionManager.showCollection();
    }
}

