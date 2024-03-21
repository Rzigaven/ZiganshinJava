package org.example;

public class ThirdTask {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Четные числа: ");
        for(int number : numbers) {
            if(number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }

}
