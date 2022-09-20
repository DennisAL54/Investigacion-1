import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldReturnPerimeter(){
        Rectangle rectangle = new Rectangle(0,0,20,30);
        assertEquals(100, rectangle.calculatePerimeter());
    }

    @Test
    void shouldReturnArea(){
        Rectangle rectangle = new Rectangle(0,0,30,15);
        assertEquals(450, rectangle.calculateArea());
    }

}