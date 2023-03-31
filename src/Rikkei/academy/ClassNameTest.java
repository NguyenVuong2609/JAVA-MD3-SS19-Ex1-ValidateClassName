package Rikkei.academy;

import java.util.Scanner;

public class ClassNameTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidateClassName validateClassName = new ValidateClassName();
        System.out.println("Enter the class name: ");
        String className = sc.nextLine();
        System.out.println(className + " is " + validateClassName.validate(className));
    }
}
