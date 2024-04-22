package Managers;

import java.io.File;

public class FileHandler
{
    private static File file;

    /**
     Возвращает текущий файл.
     @return текущий файл
     */
    public static File getFile()
    {
        return file;
    }

    /**
     Устанавливает файл по указанному пути.
     @param filePath путь к файлу
     */
    public static void setFile(String filePath)
    {
        if(filePath.equals("dev/null") || filePath.equals("dev/random"))
        {
            System.out.println("Недопустимый файл");
            System.exit(0);
        }
        FileHandler.file = new File(filePath);
    }
}
