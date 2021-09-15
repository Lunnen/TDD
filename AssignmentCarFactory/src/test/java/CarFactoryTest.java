import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarFactoryTest {

    private CarFactory carFactory;

    @Test
    public void new_car_from_factory() throws IllegalArgumentException {
        carFactory = new CarFactory();
        Car car = carFactory.createCarModel("Volvo", "Red");

        assertEquals("Red", car.getCarColor());
        assertEquals("Volvo", car.getCarModel());
        assertFalse((car.getCarColor().length() == 4), "This will fail");

        Car car2 = carFactory.createCarModel("Volvo");
        assertEquals("Black", car2.getCarColor());
        assertFalse((car2.getCarColor().length() == 4), "This will fail");
    }

    @Test
    public void new_car_from_factory_with_another_model() throws IllegalArgumentException {
        carFactory = new CarFactory();
        Car car = carFactory.createCarModel("Saab", "Yellow");

        assertNotNull(car);
        assertEquals("Yellow", car.getCarColor());
        assertEquals("Saab", car.getCarModel());
        assertFalse((car.getCarColor().length() == 5), "This will fail");

        Car car3 = carFactory.createCarModel("Saab");
        assertEquals("White", car3.getCarColor());
        assertFalse((car3.getCarColor().length() == 4), "This will fail");
    }

    @Test
    public void test_illegal_argument_exception() {

        carFactory = new CarFactory();

        IllegalArgumentException illegalArgumentException =
                assertThrows(IllegalArgumentException.class,
                        () -> carFactory.createCarModel("Volkswagen"));

        assertEquals("No such model!", illegalArgumentException.getMessage());

    }

    @Test
    public void new_car_with_engine() throws IllegalArgumentException {
        carFactory = new CarFactory();
        Car car = carFactory.createCarModel("Volvo", "Green");

        assertNotNull(car);
        assertEquals("V4 2.5D", car.getCarEngine());
        assertTrue((car.getCarEngine().length() > 1), "This will PASS");
    }

}
