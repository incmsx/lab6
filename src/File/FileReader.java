package File;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class FileReader
{
    private static String fileInfo;

    public static void readFile(String filePath)
    {
        File file = new File(filePath);
//        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file)))
//        {
//            byte[] buffer = new byte[1024];
//            int bytesRead;
//
//            while ((bytesRead = bis.read(buffer)) != -1)
//            {
//                fileInfo = new String(buffer,0,bytesRead);
//            }
//
//            if (file.length() == 0)
//            {
//                System.out.println("Файл пустой.");
//                System.exit(1);
//            }
//        }
//        catch (IOException e)
//        {
//            if (!file.exists())
//            {
//                System.out.println("Файла не существует.");
//            }
//            if (!file.canRead())
//            {
//                System.out.println("Нет доступа к файлу.");
//            }
//            System.exit(1);
//        }

        try
        {


            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            Document document = null;
            document = dbf.newDocumentBuilder().parse(new BufferedInputStream(new FileInputStream(file)));
            Node node = document.getFirstChild();

            System.out.println(node + "sfsfsdf");
        }
        catch (SAXException | ParserConfigurationException e)
        {
            System.out.println("Не удалось распарсить.");
            System.exit(1);
        }
        catch (IOException e)
        {
            System.exit(1);
            throw new RuntimeException(e);
        }

    }
}
