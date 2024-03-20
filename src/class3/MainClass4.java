package class3;

import job.Person;

import java.util.ArrayList;
import java.util.List;

public class MainClass4 {
        public static void main(String[] args) {
            List<Shape> list = new ArrayList<Shape>();
            list.add( new Circle(5) ); //anonymous

            list.add( new Triangle(3, 4, 5) );
            list.add( new Rectangle(4, 5) );

            float area = 0;
            for (Shape item : list) {
                area += item.getArea();
            }

            System.out.println("Total area: " + area);

            float perimeter = 0;
            for (Shape item : list) {
                perimeter += item.getPerimeter();
            }

            System.out.println("Total perimeter: " + perimeter);


            }




        }
