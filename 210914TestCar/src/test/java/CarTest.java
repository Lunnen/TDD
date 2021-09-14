import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void creation_of_new_car_with_color(){
        Car output = new Car("red");

        assertEquals( "red", output.getColor());
    }
}
