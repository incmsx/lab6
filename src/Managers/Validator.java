package Managers;

import InputData.Color;

public class Validator
{
    public static boolean isInputOk(String input)
    {
        if(input.isEmpty() || input == null)
        {
            System.out.println("Строчка пуста.");
            return false;
        }
        return true;
    }

    public static boolean isCoordinateXOk(String input)
    {
        if(!isInputOk(input))
        {
            return false;
        }

        if(!checkConversion(input, Integer.class))
        {
            return false;
        }

        if (Integer.parseInt(input) <= 0)
        {
            System.out.println("Рост не может быть меньше или равен 0.");
        }

        return true;
    }

    public static boolean isCoordinateYOk(String input)
    {
        if(!isInputOk(input))
        {
            return false;
        }

        if(!checkConversion(input, Integer.class))
        {
            return false;
        }

        if (Integer.valueOf(input) > 289)
        {
            System.out.println("Значение не может быть больше, чем 289.");
            return false;
        }

        return true;
    }

    public static boolean isHeightOk(String input)
    {
        if(!isInputOk(input))
        {
            return false;
        }

        if(!checkConversion(input, Integer.class))
        {
            return false;
        }

        if(Integer.valueOf(input) <= 0)
        {
            System.out.println("Рост не может быть меньше либо равен 0.");
            return false;
        }

        return true;
    }

    public static boolean isWeightOk(String input)
    {
        if(!isInputOk(input))
        {
            return false;
        }

        if(!checkConversion(input, Long.class))
        {
            return false;
        }

        if(Long.valueOf(input) <= 0)
        {
            System.out.println("Вес не может быть меньше либо равен 0.");
            return false;
        }
        return true;
    }

    public static <T> boolean isLocationCoordsOk(String input, Class <T> dataType)
    {
        if(!isInputOk(input))
        {
            return false;
        }

        if(!checkConversion(input, dataType))
        {
            return false;
        }
        return true;
    }

    public static <T> boolean checkConversion(String value, Class<T> dataType) {
        try
        {
            T convertedValue = dataType.getConstructor(String.class).newInstance(value);
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Неверный тип данных.");
            return false;
        }
    }

    public static <T extends Enum<T>> boolean isEnumOk(String input, Class<T> enumClass)
    {
        if(!isInputOk(input))
        {
            return false;
        }
        for (T value: enumClass.getEnumConstants())
        {
            if(input.toUpperCase().equals(String.valueOf(value)))
            {
                return true;
            }
        }
        System.out.println("Введите существующее значение ^^^ ");
        return false;
    }
}
