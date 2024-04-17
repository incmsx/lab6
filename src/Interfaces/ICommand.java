package Interfaces;

/**
 * Интерфейс для определения команды, которую можно выполнить с помощью метода execute.
 */
public interface ICommand
{
    /**
     * Выполняет команду с указанными аргументами.
     * @param args Массив строковых аргументов для выполнения команды.
     */
    void execute(String[] args);
}
