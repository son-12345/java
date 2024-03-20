package assigment2;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass3 {
    public static void main(String args[]) {
        System.out.println("Hello");

        Scanner input = new Scanner(System.in);


        Person person = new Person("Tuan", "tuan@gmail", 100);
        person.depositMoney();

        person.display();

        int bills[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter bill: ");
            bills[i] = input.nextInt();
        }

        int total = person.calcTotal(bills);
        System.out.println("Total " + total);

        boolean bCheck = person.payMoney(total);
        if( bCheck ) {
            System.out.println("Pay successful");
        } else {
            System.out.println("Can not paid");
        }

    }
}
