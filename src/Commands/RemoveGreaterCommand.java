package Commands;

import Fillers.PersonGenerator;
import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;
import Managers.Parser;

import java.util.*;

//Receiver
/**
 * Класс RemoveGreaterCommand реализует интерфейс ICommand и представляет команду удаления из коллекции всех элементов, превышающих заданный.
 */
public class RemoveGreaterCommand implements ICommand
{
    /**
     * Возвращает описание команды в виде строки.
     * @return Описание команды удаления из коллекции всех элементов, превышающих заданный.
     */
    @Override
    public String toString() {
        return "remove_greater {element} : удалить из коллекции все элементы, превышающие заданный";
    }

    /**
     * Выполняет команду удаления из коллекции всех элементов, превышающих заданный элемент.
     * @param args Массив строковых аргументов. Не используется в данной команде.
     */
    @Override
    public void execute(String[] args)
    {
        Person addedPerson = PersonGenerator.generatePerson(new Scanner(System.in));
        List<Long> keysToRemove = new ArrayList<>();

        for(Map.Entry<Long,Person> entry: CollectionManager.getPersonCollection().entrySet())
        {
            if(addedPerson.compareTo(entry.getValue()) < 0)
            {
                keysToRemove.add(entry.getKey());
            }
        }

        for (Long key : keysToRemove)
        {
            CollectionManager.removeElement(key);
        }
    }
}
