import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarFactoryTest {

    private CarFactory carFactory;

    @Test
    public void new_car_with_color(){

        assertEquals("ABC123", carFactory.createCarModel() );
    }

}
