import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void creation_of_new_car(){
        Car output = new Car();

        assertEquals( 6, output.getRegNr().length());
    }
}
