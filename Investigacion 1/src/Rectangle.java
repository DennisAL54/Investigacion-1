
public class Rectangle extends Figure{
    public Rectangle(){}

    public Rectangle(int area, int perimeter, int base, int height) {
        super(area, perimeter, base, height);
    }

    @Override
    public int calculateArea(){
        area = base * height;
        return area;
    }

    @Override
    public int calculatePerimeter(){
        perimeter = (2*base) + (2*height);
        return perimeter;
    }
}
