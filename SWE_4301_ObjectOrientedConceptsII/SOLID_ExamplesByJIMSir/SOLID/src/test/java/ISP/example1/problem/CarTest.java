package ISP.example1.problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jubair.
 * Date: 20/10/22
 * Time: 10:50 AM
 */

class CarTest {
    Car car;
    @BeforeEach
    public void instantiate(){
        car = new Car();
    }

    @Mock Switches switches;

    @Test
    public void testRadioOn() throws Exception{
        car.turnRadioOn();
        assertTrue(car.radioOn);

//        Field radioOn = Car.class.getDeclaredField("radioOn");
//        Mockito.when(switches.turnRadioOn()).thenReturn(true);
    }

}