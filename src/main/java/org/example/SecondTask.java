package org.example;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = getLine(scanner, "Введите первую строку: ");
        String b = getLine(scanner, "Введите вторую строку: ");
        compareLines(a,b);
    }

    static String getLine(Scanner scanner, String line) {
        System.out.println(line);
        return scanner.nextLine();
    }

    static void compareLines(String a, String b) {
        if (a.equals(b))
            System.out.println("Строки идентичны");
        else System.out.println("Строки неидентичны");
    }
}
