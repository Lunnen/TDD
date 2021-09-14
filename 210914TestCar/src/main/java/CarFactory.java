
public class CarFactory {
    private String regNr;
    private String color;
    private CarModel carModel;

    public CarFactory(String color) {
        this.color = color;

        setRegNr(generateRegistrationNumber());
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String generateRegistrationNumber(){
        return ("" + (char)(getLetter()) + ((char)(getLetter())) +
                ((char)(getLetter())) + "" + getNumber() + getNumber() + getNumber());
    }

    private int getNumber() {
        return (int)(Math.random() * 10);
    }

    private int getLetter() {
        return 65 + (int) (Math.random() * (90 - 65));
    }

    public String getColor() {
        return color;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    void createCarModel(String name){
        switch (name.toLowerCase()) {
            case "volvo" -> {
                carModel = new Volvo();
                return;
            }
            case "saab" -> {
                carModel = new Saab();
                return;
            }
        }
        throw new RuntimeException("No matching object could be created");
    }
    }
