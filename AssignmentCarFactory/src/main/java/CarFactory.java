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
        if(model.equalsIgnoreCase("volvo")){
            return new Volvo(color);
        }
        if(model.equalsIgnoreCase("saab")){
            return new Saab(color);
        }
        return null;
    }

}
