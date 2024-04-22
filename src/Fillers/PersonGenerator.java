package Fillers;

import InputData.*;
import Managers.CollectionManager;
import Managers.Validator;

import java.util.Scanner;

public class PersonGenerator
{
    static String input;
    static String name;
    static Integer height;
    static Long weight;
    static Coordinates coordinates;
    static Location location;
    static Color hairColor;
    static Country nationality;

    public static void generatePerson(Long key)
    {
        Scanner scanner = new Scanner(System.in);

        if(KeyGenerator.getUsedKeys().contains(key))
        {
            System.out.println("Элемент с заданным ключом уже существует.");
            return;
        }
        System.out.println(KeyGenerator.getUsedKeys());

        generateName(scanner);
        generateHeight(scanner);
        generateWeight(scanner);
        generateCoordinates(scanner);
        generateLocation(scanner);
        generateColor(scanner);
        generateCountry(scanner);

        Person person = new Person(name, coordinates, height, weight, hairColor, nationality, location);
        CollectionManager.addToCollection(person, key);
        KeyGenerator.addUsedKey(key);

    }
    public static Person generatePerson()
    {
        Scanner scanner = new Scanner(System.in);

        generateName(scanner);
        generateHeight(scanner);
        generateWeight(scanner);
        generateCoordinates(scanner);
        generateLocation(scanner);
        generateColor(scanner);
        generateCountry(scanner);

        return new Person(name, coordinates, height, weight, hairColor, nationality, location);
    }

    private static void generateCountry(Scanner scanner)
    {
        while(true)
        {
            System.out.println("Выберете национальность: ");
            for (Country country: Country.values())
            {
                System.out.println(country);
            }
            System.out.println("------------");

            input = scanner.nextLine();

            if(!Validator.isEnumOk(input, Country.class))
            {
                continue;
            }
            nationality = Country.valueOf(input.toUpperCase());
            break;
        }
    }
    private static void generateColor(Scanner scanner)
    {
        while(true)
        {
            System.out.println("Выберете цвет волос: ");
            for (Color color: Color.values())
            {
                System.out.println(color);
            }
            System.out.println("------------");
            input = scanner.nextLine();
            if(!Validator.isEnumOk(input, Color.class))
            {
                continue;
            }
            hairColor = Color.valueOf(input.toUpperCase());
            break;
        }
    }
    private static void generateWeight(Scanner scanner)
    {
        while (true) {
            System.out.print("Введите вес(Long): ");
            input = scanner.nextLine();
            if(!Validator.isWeightOk(input))
            {
                continue;
            }
            weight = Long.valueOf(input);
            break;
        }
    }

    private static void generateHeight(Scanner scanner)
    {
        while (true)
        {
            System.out.print("Введите рост(Integer): ");
            input = scanner.nextLine();
            if(!Validator.isHeightOk(input))
            {
                continue;
            }
            height = Integer.valueOf(input);
            break;
        }
    }
    private static void generateLocation(Scanner scanner)
    {
        while (true)
        {
            Double x;
            Long y;
            Integer z;
            String locationName;

            System.out.print("Введите Location(x)(Double): ");
            input = scanner.nextLine();

            if (!Validator.isLocationCoordsOk(input, Double.class))
            {
                continue;
            }
            x = Double.valueOf(input);
            while (true)
            {
                System.out.print("Введите Location(y)(Long): ");
                input = scanner.nextLine();
                if (!Validator.isLocationCoordsOk(input, Long.class)) {
                    continue;
                }
                y = Long.valueOf(input);

                while (true)
                {
                    System.out.print("Введите Location(z)(Integer): ");
                    input = scanner.nextLine();
                    if (!Validator.isLocationCoordsOk(input, Integer.class)) {
                        continue;
                    }
                    z = Integer.valueOf(input);

                    while (true)
                    {
                        System.out.print("Введите название локаци(String): ");
                        input = scanner.nextLine();
                        if(!Validator.isInputOk(input))
                        {
                            continue;
                        }
                        locationName = input;
                        break;
                    }
                    break;
                }
                break;
            }
            location = new Location(x, y, z, locationName);
            break;
        }
    }
    private static void generateName(Scanner scanner)
    {
        while (true) {
            System.out.print("Введите имя(строка): ");
            input = scanner.nextLine();
            if(!Validator.isInputOk(input))
            {
                continue;
            }
            name = input;
            break;
        }
    }
    private static void generateCoordinates(Scanner scanner)
    {
        while (true) {
            System.out.print("Введите Coordinate(x)(Integer): ");
            input = scanner.nextLine();
            Integer x;
            Integer y;
            if(!Validator.isCoordinateXOk(input))
            {
                continue;
            }
            x = Integer.valueOf(input);
            while (true)
            {
                System.out.print("Введите Coordinate(y)(Integer): ");
                input = scanner.nextLine();
                if(!Validator.isCoordinateYOk(input))
                {
                    continue;
                }
                y = Integer.valueOf(input);
                break;
            }
            coordinates = new Coordinates(x, y);
            break;
        }
    }
}
