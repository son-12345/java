package class1;

import java.util.Scanner;

public class MainClass {
    public static void  main(String[] args) {
//        System.out.println("Hello World");
//
//        System.out.println("Enter your name" );
//        Scanner input = new Scanner(System.in);
//
//        String name = input.nextLine();
//        System.out.println("Hello" + name);
//
//        int number[] = new int[5];
//        Scanner input = new Scanner(System.in);
//        int total=0;
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Enter your number");
//            number[i] = input.nextInt();
//
//            total += number[i];
//        }
//
//        System.out.print("Total = " + total);
        Book book1=new Book();

//        book1.setTitle("Program");
//        book1.setAuthor("Nguyen The Son");
        book1.input();

        book1.display();
    }
}
