package Managers;

import InputData.*;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Parser
{
    public static String parseCommand(String line)
    {
        String commandName = "";
        try
        {
            String[] wordsInLine = line.split(" ");
            commandName = wordsInLine[0];
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Нужно команду ввести!");
        }
        return commandName;
    }

    public static Location parseLocation(Node location)
    {
        NodeList locationChildren = location.getChildNodes();

        Double x = null;
        Long y = null;
        Integer z = null;
        String name = null;

        for (int i = 0; i < locationChildren.getLength(); i++)
        {
            if (locationChildren.item(i).getNodeType() != Node.ELEMENT_NODE)
            {
                continue;
            }
            try {
                switch (locationChildren.item(i).getNodeName()) {
                    case "x":
                        x = Double.valueOf(locationChildren.item(i).getTextContent());
                        break;
                    case "y":
                        y = Long.valueOf(locationChildren.item(i).getTextContent());
                        break;
                    case "z":
                        z = Integer.valueOf(locationChildren.item(i).getTextContent());
                        break;
                    case "name":
                        name = locationChildren.item(i).getTextContent();
                        break;
                }
            }
            catch (Exception e)
            {
                System.out.println("Unexpected value of " + locationChildren.item(i).getNodeName());
            }
        }
        if(x != null && y != null && z != null)
        {
            Location location1 = new Location(x, y, z);
            if (name.length() > 0)
            {
                location1.setName(name);
            }
            return location1;
        }
        return null;
    }
    public static Coordinates parseCoordinates(Node coordinatesNode)
    {
        NodeList coordinatesChildren = coordinatesNode.getChildNodes();

        Integer x = null;
        Integer y = null;

        for (int i = 0; i < coordinatesChildren.getLength(); i++)
        {
            if (coordinatesChildren.item(i).getNodeType() != Node.ELEMENT_NODE)
            {
                continue;
            }
            try
            {
                switch (coordinatesChildren.item(i).getNodeName()) {
                    case "x":
                        x = Integer.valueOf(coordinatesChildren.item(i).getTextContent());
                        break;
                    case "y":
                        y = Integer.valueOf(coordinatesChildren.item(i).getTextContent());
                        break;
                }
            }
            catch (Exception e)
            {
                System.out.println("Unexpected value of " + coordinatesChildren.item(i).getNodeName());
            }
        }
        if(x != null && y != null && y <= 289)
        {
            return new Coordinates(x, y);
        }
        return null;
    }

    public static Person parsePerson(Node personNode)
    {
        NodeList personChildren = personNode.getChildNodes();

        String name = null;
        Coordinates coordinates = null;
        Location location = null;
        Integer height = null;
        Long weight = null;
        Color hairColor = null;
        Country nationality = null;

        for (int i = 0; i < personChildren.getLength(); i++)
        {
            if (personChildren.item(i).getNodeType() != Node.ELEMENT_NODE)
            {
                continue;
            }
            try {
                switch (personChildren.item(i).getNodeName().toLowerCase())
                {
                    case "name":
                        name = personChildren.item(i).getTextContent();
                        break;
                    case "coordinates":
                        coordinates = parseCoordinates(personChildren.item(i));
                        break;
                    case "location":
                        location = parseLocation(personChildren.item(i));
                        break;
                    case "country":
                         nationality = Country.valueOf(personChildren.item(i).getTextContent().toUpperCase());
                        break;
                    case "color":
                        hairColor = Color.valueOf(personChildren.item(i).getTextContent().toUpperCase());
                        break;
                    case "height":
                        height = Integer.valueOf(personChildren.item(i).getTextContent());
                        break;
                    case "weight":
                        weight  = Long.valueOf(personChildren.item(i).getTextContent());
                        break;
                }
            }
            catch (Exception e)
            {
                System.out.println("Unexpected value of " + personChildren.item(i).getNodeName());
            }
        }
        if((name != null && name.length() > 0) && coordinates != null && location != null
                && (height != null && height > 0) && (weight != null && weight > 0) &&
                hairColor != null && nationality != null)
        {
            return new Person(name, coordinates,height, weight, hairColor, nationality, location);
        }
        return null;
    }

}
