package Commands;

import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;
import Managers.Parser;

import java.util.Hashtable;
import java.util.Map;

//Receiver
/**
 * Класс FilterGreaterThenHeight реализует интерфейс ICommand и представляет команду фильтрации элементов по полю height.
 */
public class FilterGreaterThenHeight implements ICommand {

    /**
     * Возвращает описание команды в виде строки.
     * @return Описание команды фильтрации элементов по полю height.
     */
    @Override
    public String toString() {
        return "filter_greater_than_height height : вывести элементы, " +
                "значение поля height которых больше заданного";
    }

    /**
     * Выполняет команду фильтрации элементов по полю height.
     * @param args Массив строковых аргументов. Первый аргумент - значение высоты для фильтрации.
     */
    @Override
    public void execute(String[] args)
    {
        Hashtable<Long, Person> personTable = CollectionManager.getPersonCollection();
        try
        {
            Integer height = Integer.valueOf(Parser.parseArgument(args));
            for (Map.Entry<Long, Person> entry : personTable.entrySet())
            {
                if (entry.getValue().getHeight() > height)
                {
                    System.out.println(entry.getValue().toString());
                }
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Высота элемента введена неправильно.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Высота элемента не введена.");
        }
    }
}

