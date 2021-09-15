public class CarFactory {

    public Car createCarModel(String model) {
        if(model.equalsIgnoreCase("volvo")){
            return new Volvo();
        }
        if(model.equalsIgnoreCase("saab")){
            return new Saab();
        }
        return null;
    }

    public Car createCarModel(String model, String color) {
        return switch (model.toLowerCase()) {
            case "volvo" -> new Volvo(color);
            case "saab" -> new Saab(color);
            default -> null;
        };
    }

}
