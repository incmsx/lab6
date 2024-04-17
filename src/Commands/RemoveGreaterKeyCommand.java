package Commands;

import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;
import Managers.Parser;

import java.util.*;

//Receiver
/**
 * Класс RemoveGreaterKeyCommand реализует интерфейс ICommand и представляет команду удаления из коллекции всех элементов, ключ которых превышает заданный.
 */
public class RemoveGreaterKeyCommand implements ICommand {

    /**
     * Возвращает описание команды в виде строки.
     * @return Описание команды удаления из коллекции всех элементов, ключ которых превышает заданный.
     */
    @Override
    public String toString() {
        return "remove_greater_key null : удалить из коллекции все элементы, ключ которых превышает заданный";
    }

    /**
     * Выполняет команду удаления из коллекции всех элементов, ключ которых превышает заданный.
     * @param args Массив строковых аргументов, содержащих заданный ключ.
     */
    @Override
    public void execute(String[] args)
    {
        try
        {
            Long argKey = Long.valueOf(Parser.parseArgument(args));

            Set<Long> keys = CollectionManager.getPersonCollection().keySet();
            List<Long> keysToRemove = new ArrayList<>();

            for (Long key : keys)
            {
                if (argKey < key)
                {
                    keysToRemove.add(key);
                    System.out.printf("Объект с ключом %s удален. \n", key);
                }
            }
            for (Long key : keysToRemove)
            {
                CollectionManager.removeElement(key);
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Ключ элемента введен неправильно.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Ключ элемента не введен.");
        }
    }
}

