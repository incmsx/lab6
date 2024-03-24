import Managers.CommandInvoker;
import Managers.CommandSelector;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class Main
{
    public static void main(String[] args)
    {
        CommandInvoker invoker = new CommandInvoker(new CommandSelector());

        while (true) {
            System.out.print("shell>> ");
            Scanner sc = new Scanner(in);
            invoker.Execute(sc.nextLine());
        }
    }

}