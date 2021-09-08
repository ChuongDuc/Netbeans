package Exercise1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1. TC = 1 - test f1()");
        System.out.println("2. TC = 2 - test f2()");
        System.out.print("Enter TC: ");
        int TC = s.nextInt();
        System.out.print("Enter a string: ");
        String space = s.nextLine();
        String st = s.nextLine();

        MyString ms = new MyString();

        if (TC == 1) {
            System.out.println("OUPUT: " + ms.f1(st));
        } else {
            System.out.println("OUPUT: " + ms.f2(st));
        }

    }
}
