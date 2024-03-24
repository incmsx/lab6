package InputData;

public class Location {
    private Double x; //Поле не может быть null
    private Long y; //Поле не может быть null
    private Integer z; //Поле не может быть null
    private String name; //Строка не может быть пустой, Поле может быть null

    public Location(Double x, Long y, Integer z, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public Location(Double x, Long y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Long getY() {
        return y;
    }

    public void setY(Long y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
