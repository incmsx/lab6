package Managers;

import InputData.Person;
import Managers.CollectionManager;
import Managers.Parser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;


public class FileReader
{
    public static void readFile(File file)
    {
        if(file.length() == 0)
        {
            System.out.println("Файл пустой");
            return;
        }

        Document document = null;
        try
        {
            document = buildDocument(file);
        }
        catch (SAXException | ParserConfigurationException e)
        {
            System.out.println("Не удалось распарсить.");
            System.exit(1);
        }
        catch (Exception e)
        {
            if (!file.exists())
            {
                System.out.println("Файла не существует.");
                System.exit(1);
            }
            if (!file.canRead())
            {
                System.out.println("Нет доступа к файлу.");
                System.exit(1);
            }
        }

        if (document == null)
        {
            System.out.println("Укажите полный путь к файлу...");
            System.exit(0);
        }

        Node rote = document.getFirstChild();

        NodeList roteChildren = rote.getChildNodes();
        for (int i = 0; i < roteChildren.getLength(); i++)
        {
            if (roteChildren.item(i).getNodeType() != Node.ELEMENT_NODE)
            {
                continue;
            }
            if(roteChildren.item(i).getNodeName().toLowerCase() == "person")
            {
                Person person = (Parser.parsePerson(roteChildren.item(i)));
                CollectionManager.addToCollection(person);
                System.out.printf("Персонаж с  id = %s успешно добавлен в коллекцию! \n", person.getId());
            }
            else
            {
                System.out.println("В вашем файле ошибка!");
                System.exit(0);
            }
        }
    }

    private static Document buildDocument(File file) throws ParserConfigurationException, IOException, SAXException
    {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document document;
        document = dbf.newDocumentBuilder().parse(new BufferedInputStream(new FileInputStream(file)));
        if (file.length() == 0)
        {
            System.out.println("Файл пустой.");
            return null;
        }
        return document;
    }
}
