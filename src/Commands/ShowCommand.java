package Commands;

import Interfaces.ICommand;
import Managers.CollectionManager;

//Receiver
/**
 * Класс ShowCommand реализует интерфейс ICommand и представляет команду вывода всех элементов коллекции в строковом представлении.
 */
public class ShowCommand implements ICommand {

    /**
     * Возвращает описание команды в виде строки.
     * @return Описание команды вывода всех элементов коллекции в строковом представлении.
     */
    @Override
    public String toString() {
        return "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }

    /**
     * Выполняет команду вывода всех элементов коллекции в строковом представлении.
     * @param args Не используется в этой команде.
     */
    @Override
    public void execute(String[] args)
    {
        CollectionManager.showCollection(); // вызов метода для вывода всех элементов коллекции
    }
}

