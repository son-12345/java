package class3;

public class Triangle extends Shape {
    float a;
    float b;
    float c;
    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        float p = (a + b + c) / 2;

        //square root
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void display() {
        System.out.println("------Triangle------");
        System.out.println("A = " + this.a);
        System.out.println("B = " + this.b);
        System.out.println("C = " + this.c);
        System.out.println("area:" + getArea());
        System.out.println("perimeter:" +getPerimeter());
    }
    public void printResult() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
