public class Figure {
    public int area;
    public int perimeter;
    public int base;
    public int height;

    public Figure(){}

    public Figure(int area, int perimeter, int base, int height) {
        this.area = area;
        this.perimeter = perimeter;
        this.base = base;
        this.height = height;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public void calculateArea(){
        area = base * height;
    }

    public void calculatePerimeter(){
        perimeter = (3*base);
    }
}
