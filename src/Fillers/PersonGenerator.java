package Fillers;

import InputData.Coordinates;
import Managers.Validator;

import java.util.Scanner;

public class PersonGenerator
{
    public static void generatePerson(Long key)
    {
        Scanner scanner = new Scanner(System.in);
        String input, name;
        Integer height;
        Long weight;
        Coordinates coordinates;

        if(KeyGenerator.getUsedKeys().contains(key))
        {
            System.out.println("Элемент с заданным ключом уже существует.");
            return;
        }

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
        while (true) {
            System.out.print("Введите рост(Integer): ");
            input = scanner.nextLine();
            if(!Validator.isHeightOk(input))
            {
                continue;
            }
            height = Integer.valueOf(input);
            break;
        }

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

        while (true)
        {
            System.out.print("Введите Location(x)(Double): ");
            input = scanner.nextLine();
            Double x;
            Long y;
            Integer z;
            String locationName;
            if (!Validator.isLocationCoordsOk(input, Double.class))
            {
                continue;
            }
            x = Double.valueOf(input);
            while (true)
            {
                System.out.print("Введите Coordinate(y)(Long): ");
                input = scanner.nextLine();
                if (!Validator.isLocationCoordsOk(input, Long.class)) {
                    continue;
                }
                y = Long.valueOf(input);
                while (true)
                {
                    System.out.print("Введите Coordinate(z)(Integer): ");
                    input = scanner.nextLine();
                    if (!Validator.isLocationCoordsOk(input, Integer.class)) {
                        continue;
                    }
                    z = Integer.valueOf(input);
                }
            }
        }
    }
}
