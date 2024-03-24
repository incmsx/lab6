import Managers.CommandInvoker;

import java.util.Scanner;

import static java.lang.System.in;

public class Main
{
    public static void main(String[] args)
    {
        while (true) {
            System.out.print("ввод>> ");
            Scanner sc = new Scanner(in);

            CommandInvoker.execute(sc.nextLine());
        }
    }
}