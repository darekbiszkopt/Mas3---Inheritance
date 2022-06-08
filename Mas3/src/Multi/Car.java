package Multi;

public class Car extends Vehicle implements ICar {
    private String model;

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void addModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
