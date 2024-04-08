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

    public static void showCollection()
    {
        for (Map.Entry<Long, Person> entry : personCollection.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().toString());
        }
    }


}
