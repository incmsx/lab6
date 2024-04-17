package Commands;

import Interfaces.ICommand;
import Managers.CommandSelector;

//Receiver
/**
 * Класс HelpCommand реализует интерфейс ICommand и представляет команду вывода справки по доступным командам.
 */
public class HelpCommand implements ICommand {

    /**
     * Выполняет команду вывода справки по доступным командам.
     * @param args Массив строковых аргументов. Не используется в данной команде.
     */
    @Override
    public void execute(String[] args)
    {
        for (ICommand command : CommandSelector.getCommandsCollection().values())
        {
            System.out.println(command);
        }
    }

    /**
     * Возвращает описание команды в виде строки.
     * @return Описание команды вывода справки по доступным командам.
     */
    @Override
    public String toString()
    {
        return "help : вывести справку по доступным командам";
    }
}

