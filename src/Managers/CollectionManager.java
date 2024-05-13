package Managers;

import Fillers.KeyGenerator;
import InputData.Person;

import java.util.Date;
import java.util.Hashtable;
import java.util.Map;

public class CollectionManager
{
    private static Hashtable<Long, Person> personCollection = new Hashtable<>();
    private static Date initilizationDate;

    public static void setInitilizationDate(Date initilizationDate)
    {
        CollectionManager.initilizationDate = initilizationDate;
    }

    public static Date getInitilizationDate() {
        return initilizationDate;
    }

    public static Hashtable<Long, Person> getPersonCollection()
    {
        return personCollection;
    }
    public static void addToCollection(Person person)
    {
        if(person == null)
        {
            System.out.println("Не получилось добавить человека...");
            System.exit(0);
        }
        personCollection.put(KeyGenerator.generateKey(),person);
    }

    public static void addToCollection(Person person, Long key)
    {
        if(person == null)
        {
            System.out.println("Не получилось добавить человека...");
            System.exit(0);
        }
        personCollection.put(key,person);
    }

    public static void showCollection()
    {
        for (Map.Entry<Long, Person> entry : personCollection.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().toString() + "\n");
        }
    }

    public static  void removeElement(Long key)
    {
        Hashtable<Long, Person> personCollection = getPersonCollection();

        if(personCollection.containsKey(key))
        {
            personCollection.remove(key);
        }
        else
        {
            System.out.printf("Элемента с ключом %s не существует \n", key);
        }
    }

    @Override
    public String toString() {
        if (personCollection.isEmpty())
        {
            return "Колекция пустая";
        }
        StringBuilder info = new StringBuilder();

        for(Map.Entry<Long, Person> entry : personCollection.entrySet())
        {
            info.append(entry.getValue());
        }
        info.append("\n\n");
        return info.toString();
    }

}
