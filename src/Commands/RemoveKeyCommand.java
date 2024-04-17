package Commands;

import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;
import Managers.Parser;

import java.util.Hashtable;

//Receiver
/**
 * Класс RemoveKeyCommand реализует интерфейс ICommand и представляет команду удаления элемента из коллекции по его ключу.
 */
public class RemoveKeyCommand implements ICommand {

    /**
     * Возвращает описание команды в виде строки.
     * @return Описание команды удаления элемента из коллекции по его ключу.
     */
    @Override
    public String toString() {
        return "remove_key null : удалить элемент из коллекции по его ключу";
    }

    /**
     * Выполняет команду удаления элемента из коллекции по его ключу.
     * @param args Массив строковых аргументов, содержащих ключ элемента для удаления.
     */
    @Override
    public void execute(String[] args)
    {
        Long key;
        try
        {
            key = Long.parseLong(Parser.parseArgument(args));
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Введите правильный ключ элемента для удаления.");
            return;
        }

        CollectionManager.removeElement(key);
    }
}
