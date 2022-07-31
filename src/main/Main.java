package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//1
    Scanner scan = new Scanner(System.in);
        LogicalOp op = new LogicalOp();
        System.out.println("Exercise 1: ");
        op.afisare1(5);
//2
        System.out.println("Exercise 2: ");
        op.afisare2(7);
//3
        System.out.println("Exercise 3: ");
        op.afisare3(3,7);
//4
        System.out.println("Exercise 4: ");
        op.afisare4(9, 2);
//5
        System.out.println("Exercise 5: ");
        op.afisare5();
//6
        System.out.println("Exercise 6: ");
        op.afisare6();
//7
        System.out.println("Exercise 7: ");
        System.out.println("The result of the sum is: " + op.afisare7(99));
//8
        System.out.println("Exercise 8: ");
        System.out.println("The result of the average is: " + op.afisare8(98));
//9
        System.out.println("Exercice 9: ");
        op.afisare9();
}

}
