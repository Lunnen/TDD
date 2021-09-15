public class Saab implements Car {

    private String carModel = "Saab";
    private String carColor;
    private String registrationNumber;

    public Saab() {
        setRegistrationNumber(randomRegistration());
        setCarColor("White");
    }
    public Saab(String carColor) {
        setRegistrationNumber(randomRegistration());
        setCarColor(carColor);
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String getCarModel() {
        return this.carModel;
    }

    @Override
    public String getCarColor() {
        return this.carColor;
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
