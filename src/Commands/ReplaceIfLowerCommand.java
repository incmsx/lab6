package Commands;

import Fillers.PersonGenerator;
import InputData.Person;
import Interfaces.ICommand;
import Managers.CollectionManager;
import Managers.Parser;

import java.util.Scanner;

//Receiver
/**
 * Класс ReplaceIfLowerCommand реализует интерфейс ICommand и представляет команду замены значения по ключу, если новое значение меньше старого.
 */
public class ReplaceIfLowerCommand implements ICommand {

    /**
     * Возвращает описание команды в виде строки.
     * @return Описание команды замены значения по ключу, если новое значение меньше старого.
     */
    @Override
    public String toString() {
        return "replace_if_lowe null {element} : заменить значение по ключу, если новое значение меньше старого";
    }

    /**
     * Выполняет команду замены значения по ключу, если новое значение меньше старого.
     * @param args Массив строковых аргументов, содержащих ключ элемента и новое значение для замены.
     */
    @Override
    public void execute(String[] args)
    {

        try
        {
            Long key = Long.valueOf(Parser.parseArgument(args));
            Person addedPerson = PersonGenerator.generatePerson(new Scanner(System.in));

            if(!CollectionManager.getPersonCollection().containsKey(key))
            {
                System.out.println("Элемента с таким ключом не существует.");
                return;
            }

            if(CollectionManager.getPersonCollection().get(key).compareTo(addedPerson) < 0)
            {
                System.out.println("Новое значение больше старого.");
                return;
            }
            else if (CollectionManager.getPersonCollection().get(key).compareTo(addedPerson) == 0)
            {
                System.out.println("Новое значение равно старому.");
                return;
            }

            CollectionManager.getPersonCollection().replace(key, addedPerson);

        }
        catch (NumberFormatException e)
        {
            System.out.println("Ключ введен неверно.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Ключ не введен.");
        }
    }
}

