public class CarFactory {
    private String registrationNumber;
    private String color;

    public CarFactory() {
        setRegistrationNumber(randomRegistration());
        color = "Black";
    }
    public CarFactory(String color) {
        setRegistrationNumber(randomRegistration());
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String createCarModel() {

        return getRegistrationNumber();
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
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

}
