import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldReturnPerimeter(){
        Triangle triangle = new Triangle(0,0,20,30);
        assertEquals(60, triangle.calculatePerimeter());
    }

    @Test
    void shouldReturnArea(){
        Triangle triangle = new Triangle(0,0,20,30);
        assertEquals(300, triangle.calculateArea());
    }


}