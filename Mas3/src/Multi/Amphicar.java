package Multi;

public class Amphicar extends Boat implements ICar {

    private String model;

    public Amphicar(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void addModel(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        return "Amphicar{" +
                ", brand='" + brand + '\'' +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
