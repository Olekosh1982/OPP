package homework_37;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    MainTest mainTest;

    @BeforeEach
    public void setUp() {
        mainTest = new MainTest();
    }

    @Test
    public void shortestOrLongestTest_oneElement() {
        assertEquals("a", mainTest.findShortesrOrLongest(Arrays.asList("a")));
    }

    private Object findShortesrOrLongest(List<String> a) {
        RenderingHints list = null;

        return  list;
    }
     /*   String minSizeElement = list.get(0);
        int indexMinElement = 0;
        String maxSizeElement = list.get(0);
        int indexMaxElement = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < minSizeElement.length()) {
                minSizeElement = list.get(i);
                indexMinElement = i;
            } else if (list.get(i).length() > maxSizeElement.length()) {
                maxSizeElement = list.get(i);
                indexMaxElement = i;
            }
        }
        if (indexMinElement < indexMaxElement) {
            return minSizeElement;
        }
        return maxSizeElement;
        */






    @Test
    public void shortestOrLongestTest_shortFirst() {
        assertEquals("a", mainTest.findShortesrOrLongest(Arrays.asList("bb", "a", "ddd")));
    }

    @Test
    public void shortestOrLongestTest_longFirst() {
        assertEquals("aaa", mainTest.findShortesrOrLongest(Arrays.asList("bb", "aaa", "d")));
    }

}