import Managers.FileHandler;
import Managers.FileReader;
import Managers.CommandInvoker;

import java.util.NoSuchElementException;
import java.util.Scanner;

import static java.lang.System.in;

public class Main
{

    public static void main(String[] args)
    {


        try
        {
            FileHandler.setFile(args[0]);
            FileReader.readFile(FileHandler.getFile());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Введите корректно путь к файлу.");
            System.exit(0);
        }
        while (true)
        {
            try
            {
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