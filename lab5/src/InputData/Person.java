package InputData;

import java.time.LocalDate;

public class Person
{
    private static long idCounter;
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer height; //Поле не может быть null, Значение поля должно быть больше 0
    private Long weight; //Поле не может быть null, Значение поля должно быть больше 0
    private Color hairColor; //Поле может быть null
    private Country nationality; //Поле может быть null
    private Location location; //Поле не может быть null

    public Person(long id, String name, Coordinates coordinates, LocalDate creationDate, Integer height, Long weight, Color hairColor, Country nationality, Location location) {
        idCounter += 1;
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
        this.nationality = nationality;
        this.location = location;
    }

    public static long getIdCounter() {
        return idCounter;
    }
    public long getId()
    {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Integer getHeight() {
        return height;
    }

    public Long getWeight() {
        return weight;
    }

    public Color getHairColor() {
        return hairColor;
    }

    public Country getNationality() {
        return nationality;
    }

    public Location getLocation() {
        return location;
    }

    public static void setIdCounter(long idCounter) {
        Person.idCounter = idCounter;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public void setHairColor(Color hairColor) {
        this.hairColor = hairColor;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
