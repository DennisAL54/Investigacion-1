
public class Rectangle extends Figure{
    public Rectangle(){}

    public Rectangle(int area, int perimeter, int base, int height) {
        super(area, perimeter, base, height);
    }

    @Override
    public void calculateArea(){
        area = base * height;
    }

    @Override
    public void calculatePerimeter(){
        perimeter = (2*base) + (2*height);
    }
}
