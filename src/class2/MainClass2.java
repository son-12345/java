package class2;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass2 {
    public static void main(String args[]) {
        System.out.println("Hello");

//        int numbers[] = new int[5];
//        Scanner input = new Scanner(System.in);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Enter new number : ");
//            numbers[i] = input.nextInt();
//        }
//
//        Arrays.sort(numbers);

//        for (int i = 0; i < 5; i++) {
//            System.out.println(" " + numbers[i]);
//        }

//        for (int item : numbers){
//            System.out.println(item);
//        }

        Student students[] = new Student[3];
        students[0] = new Student();
        students[0].input();
        students[1] = new Student("Nam", "nam@gmail", false);
        students[2] = new Student("Son", "son@gmail", true);

        //input data for Students in array
//        for (Student item : students) {
//            System.out.println("====Input new Student");
//            item.input();
//        }

        //display Student information
        for (Student item : students){
            item.display();
        }

        //object
//        Student student1 = new Student();
//
//        student1.setName("Tuan");
//        student1.setEmail("tuan@gmail.com");
//        student1.setActive(true);
//
//        student1.display();

    }
}