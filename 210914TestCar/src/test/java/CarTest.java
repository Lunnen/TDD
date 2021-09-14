import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CarTest {

    @Test
    public void creation_of_new_car(){
        Car output = new Car();

        assertEquals("ABC123", output.getRegNr());
    }
}
