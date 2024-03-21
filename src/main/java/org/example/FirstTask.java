package org.example;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = getNumber(scanner, "Введите первое число: ");
        int secondNumber = getNumber(scanner, "Введите второе число: ");
        compareNumbers(firstNumber, secondNumber);
        int resultSum = sum(firstNumber,secondNumber);
        int resultMinus = minus(firstNumber,secondNumber);
        int resultMultiplication = multiplication(firstNumber,secondNumber);
        double resultDivision = division(firstNumber,secondNumber);
        System.out.println("Сумма: " + resultSum +  "\nВычитание: " + resultMinus + "\nУмножение: " + resultMultiplication);

        int resultInInt = (int) resultDivision;

        if (resultDivision - resultInInt == 0) {
            System.out.println("Деление: " + resultInInt);
        } else {
            System.out.println("Деление: " + resultDivision);
        }
    }

    static int getNumber(Scanner scanner, String line) {
        System.out.println(line);
        return checkNumbers(scanner);
    }


    static int checkNumbers(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не число, введите число:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static void compareNumbers(int x, int y) {
        if (x > y) {
            System.out.println(x + " > " + y);
        } else if (y > x) {
            System.out.println(y + " > " + x);
        } else System.out.println(x + " = " + y);
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static int minus(int x, int y) {
        return x - y;
    }

    static int multiplication(int x, int y) {
        return x * y;
    }

    static double division(double x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return x / y;
    }

}
