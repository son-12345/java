package class3;


public class Rectangle extends Shape {
    float length;
    float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void display() {
        System.out.println("Length " + this.length);
        System.out.println("Width " + this.width);
    }
    public void printResult() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
