package File;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class FileReader
{
    public static void readFile(String filePath)
    {
        File file = new File(filePath);
        try
        {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            Document document = null;
            document = dbf.newDocumentBuilder().parse(new BufferedInputStream(new FileInputStream(file)));
            if (file.length() == 0)
            {
                System.out.println("Файл пустой.");
                System.exit(1);
            }
            Node node = document.getFirstChild();

        }
        catch (SAXException | ParserConfigurationException e)
        {
            System.out.println("Не удалось распарсить.");
            System.exit(1);
        }
        catch (IOException e)
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
    }
}
