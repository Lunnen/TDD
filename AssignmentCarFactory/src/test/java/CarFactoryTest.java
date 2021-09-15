import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarFactoryTest {

    private CarFactory carFactory;

    @Test
    public void new_car_with_color(){
        carFactory = new CarFactory();

        assertEquals( 6, carFactory.getRegistrationNumber().length());
        assertFalse( (carFactory.getRegistrationNumber().length() < 6), "This will fail" );
    }


}
