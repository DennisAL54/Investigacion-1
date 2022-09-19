
public class Triangle extends Figure {

    public Triangle(){}

    public Triangle(int area, int perimeter, int base, int height) {
        super(area, perimeter, base, height);
    }

    @Override
    public void calculateArea(){
        area = (base * height)/2;
    }
    @Override
    public void calculatePerimeter(){
        perimeter = base * 3;
    }
}
