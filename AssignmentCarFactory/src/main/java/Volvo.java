public class Volvo implements Car {

    private String carModel = "Volvo";
    private String carColor;

    public Volvo() {
        this.carColor = "Black";
    }
    public Volvo(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public String getCarModel() {
        return this.carModel;
    }

    @Override
    public String getCarColor() {
        return this.carColor;
    }

}
