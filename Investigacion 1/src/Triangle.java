
public class Triangle extends Figure {

    public Triangle(){}

    public Triangle(int area, int perimeter, int base, int height) {
        super(area, perimeter, base, height);
    }

    @Override
    public int calculateArea(){
        area = (base * height)/2;
        return area;
    }
    @Override
    public int calculatePerimeter(){
        perimeter = base * 3;
        return perimeter;
    }
}
