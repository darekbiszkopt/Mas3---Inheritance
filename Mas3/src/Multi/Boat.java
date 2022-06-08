package Multi;

public class Boat extends Vehicle{
    String color;

    public Boat(String brand, String color) {
        super(brand);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}