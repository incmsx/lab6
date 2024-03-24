import Managers.CommandInvoker;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static java.lang.System.in;

public class Main
{

    public static void main(String[] args)
    {
        String fileName = args[0];

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


        while (true) {
            try {
                System.out.print("ввод>> ");
                Scanner sc = new Scanner(in);

                CommandInvoker.execute(sc.nextLine());
            }
            catch (NoSuchElementException e)
            {
                System.out.println("Программу то ломать не надо(");
            }

        }
    }
}