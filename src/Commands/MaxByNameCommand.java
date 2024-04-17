package Commands;

import Comparators.NameComparator;
import Interfaces.ICommand;
import Managers.CollectionManager;

import java.util.Hashtable;

//Receiver
/**
 * Класс MaxByNameCommand реализует интерфейс ICommand и представляет команду вывода объекта из коллекции с максимальным значением поля name.
 */
public class MaxByNameCommand implements ICommand
{
    /**
     * Выполняет команду вывода объекта из коллекции с максимальным значением поля name.
     * @param args Массив строковых аргументов. Не используется в данной команде.
     */
    @Override
    public void execute(String[] args)
    {
        System.out.println(CollectionManager.getPersonCollection().values().stream().max(new NameComparator()));
    }

    /**
     * Возвращает описание команды в виде строки.
     * @return Описание команды вывода любого объекта из коллекции, значение поля name которого является максимальным.
     */
    @Override
    public String toString() {
        return "max_by_name : вывести любой объект из коллекции, " +
                "значение поля name которого является максимальным";
    }
}

