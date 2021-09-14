
public class CarFactory {
    private String regNr;
    private String color;
    private String model;
    private String carEngine;
    private CarModel carModel;

    public CarFactory(String color) {
        this.color = color;

        setRegNr(randomRegistration());
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    static String randomRegistration()
    {
        // Generate three random uppercase letters
        int letter1 = 65 + (int)(Math.random() * (90 - 65));
        int letter2 = 65 + (int)(Math.random() * (90 - 65));
        int letter3 = 65 + (int)(Math.random() * (90 - 65));

        // Generate four random digits
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        // Display number plate
        return ("" + (char)(letter1) + ((char)(letter2)) +
                ((char)(letter3)) + number1 + number2 + number3);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    CarModel createCarModel(String name){
        switch (name.toLowerCase()) {
            case "volvo" -> {
                carModel = new Volvo();
                return carModel;
            }
            case "saab" -> {
                carModel = new Saab();
                return carModel;
            }
        }
        throw new RuntimeException("No matching object could be created");
    }
    }
