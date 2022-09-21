import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldReturnPerimeter(){
        Rectangle rectangle = new Rectangle(0,0,30,15);
        //Prueba que el resultado de la operacion es correcto
        assertEquals(90, rectangle.calculatePerimeter());
        //Prueba que la base del rectangulo siempre sea mayor que la altura
        assertTrue(rectangle.base > rectangle.height);
    }

    @Test
    void shouldReturnArea(){
        Rectangle rectangle = new Rectangle(0,0,30,15);
        //Prueba en un assertion agrupado, se realizan varias pruebas a la vez.
        //Todas las fallas se reportan en conjunto
        //Esta prueba valida que el valor del area sea correcto, ademas verifica que la base del rectangulo
        //sea mayor que su altura al mismo tiempo
        assertAll("Grouped assertion",
                () -> assertEquals(450, rectangle.calculateArea()),
                () -> assertTrue(rectangle.base > rectangle.height)
        );
    }

    @Test
    void allClear(){
        //El objetivo de esta prueba es comprobar un funcionamiento completo
        //Se valida que el objeto sea valido antes de realizar las pruebas
        //Se utiliza entonces un dependent assertion, el cual requiere que todos
        //los assertions antes de las pruebas principales sean correctos
        Rectangle rectangle = new Rectangle(0,0,30,15);
        assertAll("End Results and setup",
                () -> {
                    //Se evalua que la base y la altura del rectangulo creado no sean cero
                    int tbase = rectangle.base;
                    int theight = rectangle.height;
                    assertTrue(tbase != 0);
                    assertTrue(theight != 0);

                    // Esto es ejecutado solo si lo anterior es cierto
                    assertAll("Rectangle perimeter",
                            //Se comprueba que el area y perimetro del rectangulo sea el esperado
                            () -> assertEquals(90, rectangle.calculatePerimeter()),
                            () -> assertTrue(rectangle.base > rectangle.height)
                    );
                },
                () -> {
                    // Este Dependent Assertion se procesa independientemente del anterior
                    // Los resultados del anterior no afectan a este
                    int[] result;
                    result = new int[4];
                    result[0] = rectangle.area;
                    result[1] = rectangle.perimeter;
                    result[2] = rectangle.base;
                    result[3] = rectangle.height;
                    assertArrayEquals(new int[]{0,90,30,15},result);

                    // Se ejecuta si se cumple la condicion anterior, la cual comprueba que el resultado del perimetro
                    // Se agrego al objeto
                    assertAll("Rectangle Area",
                            () -> assertEquals(450, rectangle.calculateArea()),
                            () -> assertTrue(rectangle.base > rectangle.height)
                    );
                }
        );

    }

}