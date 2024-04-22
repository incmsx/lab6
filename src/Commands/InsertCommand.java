package Commands;

import Fillers.PersonGenerator;
import Interfaces.ICommand;
import Managers.Parser;

import java.util.Scanner;

//Receiver
/**
 * Класс InsertCommand реализует интерфейс ICommand и представляет команду добавления нового элемента с заданным ключом в коллекцию.
 */
public class InsertCommand implements ICommand {

    /**
     * Возвращает описание команды в виде строки.
     * @return Описание команды добавления нового элемента с заданным ключом.
     */
    @Override
    public String toString() {
        return "insert null {element} : добавить новый элемент с заданным ключом";
    }

    /**
     * Выполняет команду добавления нового элемента с заданным ключом в коллекцию.
     * @param args Массив строковых аргументов, содержащий ключ для нового элемента.
     */
    @Override
    public void execute(String[] args)
    {
        try
        {
            PersonGenerator.generatePerson(new Scanner(System.in));
        }
        catch (NumberFormatException e)
        {
            System.out.println("Ключ элемента введен неправильно. ");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Ключ элемента не введен. ");
        }

    }
}
