
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testFunction {
    public room objroom = new room();

    @Test
        public void TC_1_1(){
            assertEquals(objroom.calculateElec(10, 15), 0);
        }
    @Test
        public void TC_1_2(){
            assertEquals(objroom.calculateElec(20, 15), 30);
        }
    @Test
        public void TC_2_1(){
            assertEquals(objroom.calculateWater(5, 10), 0);
        }
    @Test
        public void TC_2_2(){
            assertEquals(objroom.calculateWater(15, 10), 25);
        }

    @Test
        public void TC_3_1(){
            assertEquals(objroom.BillSumation("Single Bed", 15, 10, 20, 15), 1555);
        }
    @Test
        public void TC_3_2(){
            assertEquals(objroom.BillSumation("Double Bed", 15, 10, 20, 15), 2055);
        }
    @Test
        public void TC_3_3(){
            assertEquals(objroom.BillSumation("", 5, 10, 5, 15), 0);
        }
}