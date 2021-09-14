import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void creation_of_new_car_with_color(){
        CarFactory output = new CarFactory("red");

        assertEquals( "red", output.getColor());
    }
    @Test
    public void creation_of_new_car_model(){
        CarFactory output = new CarFactory("red");
        output.createCarModel("VOLVO");

        assertEquals("Volvo XC90" , output.getCarModel().getCarName());
    }
    @Test
    public void creation_of_new_car_model_Saab(){
        CarFactory output = new CarFactory("blue");
        output.createCarModel("SAAB");

        assertEquals("Saab 900" , output.getCarModel().getCarName());
        assertEquals("blue" , output.getColor());
    }
    @Test
    public void creation_of_new_car_with_engine(){
        CarFactory output = new CarFactory("red");
        output.createCarModel("VOLVO");

        assertEquals("Volvo XC90" , output.getCarModel().getCarName());
        assertEquals("V4 2.5D" , output.getCarModel().getCarEngine());
    }
}
