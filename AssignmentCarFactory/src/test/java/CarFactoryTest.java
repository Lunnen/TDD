import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarFactoryTest {

    private CarFactory carFactory;

    @Test
    public void new_car_with_registration_number(){
        carFactory = new CarFactory();

        assertEquals( 6, carFactory.getRegistrationNumber().length());
        assertFalse( (carFactory.getRegistrationNumber().length() < 6), "This will fail" );
    }
    @Test
    public void new_car_with_parameter_color(){
        carFactory = new CarFactory("Blue");

        assertEquals( "Blue", carFactory.getColor());
        assertFalse( (carFactory.getColor().length() == 0), "This will fail" );

        carFactory = new CarFactory();
        assertEquals( "Black", carFactory.getColor());
    }
    @Test
    public void new_car_from_factory(){
        carFactory = new CarFactory();
        Car car = carFactory.createCarModel("Pink");

        assertEquals( "Pink", car.getCarColor());
        assertFalse( (car.getCarColor().length() == 3), "This will fail" );

        Car car2 = carFactory.createCarModel();
        assertEquals( "Black", car2.getCarColor());
        assertFalse( (car2.getCarColor().length() == 4), "This will fail" );
    }

}
