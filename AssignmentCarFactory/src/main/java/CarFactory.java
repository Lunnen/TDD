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

    public String randomRegistration()
    {
        return ("" + (char) (getLetter()) + ((char) (getLetter())) +
                ((char) (getLetter())) + "" + getNumber() + getNumber() + getNumber());
    }

    public int getNumber() {
        return (int) (Math.random() * 10);
    }

    public int getLetter() {
        return 65 + (int) (Math.random() * (90 - 65));
    }


}
