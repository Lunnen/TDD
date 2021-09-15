import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarFactoryTest {

    private CarFactory carFactory;

    @Test
    public void new_car_from_factory(){
        carFactory = new CarFactory();
        Car car = carFactory.createCarModel("Red");

        assertEquals( "Red", car.getCarColor());
        assertEquals( "Volvo", car.getCarModel());
        assertFalse( (car.getCarColor().length() == 4), "This will fail" );

        Car car2 = carFactory.createCarModel();
        assertEquals( "Black", car2.getCarColor());
        assertFalse( (car2.getCarColor().length() == 4), "This will fail" );
    }

}
