package File;

import InputData.Location;
import Managers.Parser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader
{
    public static void readFile(String filePath)
    {
        File file = new File(filePath);

        System.out.println(file);

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
            switch (roteChildren.item(i).getNodeName())
            {
                case "location" -> System.out.println(Parser.parseLocation(roteChildren.item(i)));
                case "coordinates" -> System.out.println(Parser.parseCoordinates(roteChildren.item(i)));
                case "person" -> System.out.println(Parser.parsePerson(roteChildren.item(i)));
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
