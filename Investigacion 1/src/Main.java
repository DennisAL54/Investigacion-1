

public class Main {
    public static void main(String [] args){
        Figure figures[] = new Figure[]{
                new Rectangle(0,0,40,60),
                new Triangle(0,0,20,50)
        };
        figures[0].calculatePerimeter();
        figures[1].calculateArea();
        for (Figure figure : figures) {//For para recorrer la lista
            System.out.println("Area" + " " + figure.getArea());
        }
        for (Figure figure : figures) {//For para recorrer la lista
            System.out.println("Perimeter" + " " + figure.getPerimeter());
        }

    }
}
