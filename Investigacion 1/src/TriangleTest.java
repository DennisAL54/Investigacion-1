import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldReturnPerimeter(){
        Triangle triangle = new Triangle(0,0,30,20);
        assertEquals(90, triangle.calculatePerimeter());
        assertTrue(triangle.base > triangle.height);
    }

    @Test
    void shouldReturnArea(){
        Triangle triangle = new Triangle(0,0,30,20);
        assertAll("Grouped assertion",
                () -> assertEquals(300, triangle.calculateArea()),
                () -> assertTrue(triangle.base > triangle.height)
        );
    }
    @Test
    void allClear(){
        Triangle triangle = new Triangle(0,0,30,20);
        assertAll("Triangle set up",
                () -> {
                    int tbase = triangle.base;
                    int theight = triangle.height;
                    assertTrue(tbase != 0);
                    assertTrue(theight != 0);
                    assertAll("Perimeter test",
                            () -> assertEquals(90, triangle.calculatePerimeter()),
                            () -> assertTrue(triangle.base > triangle.height)
                    );
                },
                () -> {
                    int[] result;
                    result = new int[4];
                    result[0] = triangle.area;
                    result[1] = triangle.perimeter;
                    result[2] = triangle.base;
                    result[3] = triangle.height;
                    assertArrayEquals(new int[]{0,90,30,20},result);
                    assertAll("Area test",
                            () -> assertEquals(300, triangle.calculateArea()),
                            () -> assertTrue(triangle.base > triangle.height)
                    );
                }
        );

    }


}