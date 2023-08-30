package lesson_32.lunit_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
public  void givenRadius_whenFindArea_thenReturnArea3_14(){
    double actualArea=Circle.findArea(1D);
    double expectedArea=Math.PI;

    assertEquals(expectedArea,actualArea);
}
@Test
public  void givenAandB_whenCompare(){
        assertTrue(3>0);
}
@Test
    public  void givenAandB_whenCompare1(){
        assertTrue(0>3);
    }
}