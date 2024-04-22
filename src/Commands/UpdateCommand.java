package Commands;

import Fillers.PersonGenerator;
import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;
import Managers.Parser;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//Receiver
/**
 * Класс UpdateCommand реализует интерфейс ICommand и представляет команду обновления значения элемента в коллекции.
 */
public class UpdateCommand implements ICommand {

    /**
     * Возвращает описание команды в виде строки.
     * @return Описание команды обновления элемента коллекции.
     */
    @Override
    public String toString() {
        return "update id {element} : обновить значение элемента коллекции, id которого равен заданному";
    }

    /**
     * Выполняет команду обновления элемента коллекции.
     * @param args Массив строковых аргументов, содержащих id элемента для обновления.
     */
    @Override
    public void execute(String[] args)
    {
        Hashtable<Long, Person> personTable = CollectionManager.getPersonCollection();
        try
        {
            Long targetId = Long.valueOf(Parser.parseArgument(args));
            for (Map.Entry<Long, Person> entry : personTable.entrySet())
            {
                if (entry.getValue().getId() == targetId)
                {
                    Person person = PersonGenerator.generatePerson(new Scanner(System.in));
                    person.setId(targetId);
                    CollectionManager.addToCollection(person, entry.getKey());
                }
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Id элемента введен неправильно. ");
        }
    }
}

