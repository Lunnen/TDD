public class CarFactory {

    public Car createCarModel() {
        return new Volvo();
    }

    public Car createCarModel(String color) {
        return new Volvo(color);
    }

}
