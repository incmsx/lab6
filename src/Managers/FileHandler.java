package Managers;

import java.io.File;

public class FileHandler
{
    private static File file;

    public static File getFile() {
        return file;
    }

    public static void setFile(String filePath)
    {
        File file = new File(filePath);
        FileHandler.file = file;
    }
}
