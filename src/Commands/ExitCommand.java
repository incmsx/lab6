package Commands;

import Interfaces.ICommand;

//Receiver
/**
 * Класс ExitCommand реализует интерфейс ICommand и представляет команду завершения программы без сохранения в файл.
 */
public class ExitCommand implements ICommand {

    /**
     * Выполняет команду завершения программы без сохранения в файл.
     * @param args Массив строковых аргументов. Не используется в данной команде.
     */
    @Override
    public void execute(String[] args)
    {
        System.exit(0);
    }

    /**
     * Возвращает описание команды в виде строки.
     * @return Описание команды завершения программы без сохранения в файл.
     */
    @Override
    public String toString() {
        return "exit: завершить программу (без сохранения в файл)";
    }
}

