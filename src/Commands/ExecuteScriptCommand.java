package Commands;

import Interfaces.ICommand;
import Managers.CommandInvoker;
import Managers.Parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

//Receiver
/**
 * Класс ExecuteScriptCommand реализует интерфейс ICommand и представляет команду считывания и выполнения скрипта из файла.
 */
public class ExecuteScriptCommand implements ICommand {

    private static HashSet<String> handledScripts = new HashSet<>();

    /**
     * Возвращает описание команды в виде строки.
     * @return Описание команды считывания и выполнения скрипта из файла.
     */
    @Override
    public String toString() {
        return "execute_script file_name : считать и исполнить скрипт из указанного файла. " +
                "В скрипте содержатся команды в таком же виде, " +
                "в котором их вводит пользователь в интерактивном режиме";
    }

    /**
     * Выполняет команду считывания и выполнения скрипта из файла.
     * @param args Массив строковых аргументов. Первый аргумент - путь к файлу со скриптом.
     */
    @Override
    public void execute(String[] args)
    {
        String filePath;
        try
        {
            filePath = Parser.parseArgument(args);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Введите путь к файлу.");
            return;
        }

        File file = new File(filePath);

        handledScripts.add(filePath);
        Scanner scanner = null;
        try
        {
            scanner = new Scanner(file);
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String command = Parser.parseInputLine(line)[0];

                if(command.toLowerCase().equals("execute_script"))
                {
                    String filePathScript = Parser.parseInputLine(line)[1];
                    if(handledScripts.contains(filePathScript))
                    {
                        System.out.println("Обнаружена рекурсия, скипаем...");
                        continue;
                    }
                }

                CommandInvoker.execute(line);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Файл не найден...");
        }
        if (scanner != null) {
            scanner.close();
        }
        handledScripts.remove(filePath);
    }
}
