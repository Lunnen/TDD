import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    CarFactory output;

    @Before
    public void init() {
        output = new CarFactory("red");
    }

    @Test
    public void creation_of_new_car_with_color(){
        assertEquals( "red", output.getColor());
    }
    @Test
    public void creation_of_new_car_model(){
        output.createCarModel("VOLVO");

        assertEquals("Volvo XC90" , output.getCarModel().getCarName());
    }
    @Test
    public void creation_of_new_car_model_Saab(){
        output.createCarModel("SAAB");

        assertEquals("Saab 900" , output.getCarModel().getCarName());
        assertEquals("red" , output.getColor());
    }
    @Test
    public void creation_of_new_car_with_engine(){
        output.createCarModel("VOLVO");

        assertEquals("Volvo XC90" , output.getCarModel().getCarName());
        assertEquals("V4 2.5D" , output.getCarModel().getCarEngine());
    }
}
