package File;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader
{
    public void readFile(String fileName)
    {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName)))
        {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1)
            {
                System.out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
