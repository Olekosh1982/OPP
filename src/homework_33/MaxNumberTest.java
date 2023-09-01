package homework_33;

import lesson_32.lunit_testing.MaxNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxNumberTest {
    /*
    test cases
    1.  массив пустой
    2.  в массиве один элемент
    3. в массиве 2 элемента
    4. в массиве из нескольких элементов максимальный находится в середине
    5. в массиве из нескольких элементов максимальный первый
    6. в массиве из нескольких элементов максимальный последний

     */

    private lesson_32.lunit_testing.MaxNumber m = new MaxNumber();


    @Test
    public void zeroElt_test(){
        int[] actual = {};

        assertEquals(-1 ,m.findMax(actual));
    }


    @Test
    public void oneElt_test(){
        int[] actual = {2};

        assertEquals(2,m.findMax(actual));
    }


    @Test
    public void twoElt_test(){
        int[] actual = {2,2};

        assertEquals(2,m.findMax(actual));
    }


    @Test
    public void severalElt_middle_test(){
        int[] actual = {2,4,7,9,3,1,5,};

        assertEquals(9,m.findMax(actual));
    }
    @Test

    public void firstMaxElt_middle_test(){
        int[] actual = {10,9,4,7,3,1,5,2};

        assertEquals(10,m.findMax(actual));
    }
    @Test
    public void lastMaxElt_middle_test(){
        int[] actual = {2,4,7,5,3,1,9,10};

        assertEquals(10,m.findMax(actual));
    }

}