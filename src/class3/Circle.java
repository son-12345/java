package class3;

public class Circle extends Shape {
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("------Circle------");
        System.out.println("Radius: " + this.radius);
        System.out.println("area:" + getArea());
        System.out.println("perimeter:" +getPerimeter());
    }
    public double getPerimeter() {
        return (float)(Math.PI * 2 * this.radius);
    }
    public double getArea() {
        return (float)(Math.PI * this.radius * this.radius);
    }

    @Override
    public void printResult() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
