package com.kosmatka;

import java.util.Arrays;

public class BoobleSorting {
    public void boobleSorting() {
        int[] ints = {1, 4, 5, 2, 41, 3, 4, 1, 7, 34, 7};
        System.out.println(Arrays.toString(sort(ints)));

    }

    public static int[] sort(int[] numbers) {
        boolean change = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            int nextNumber = numbers[i + 1];
            if (currentNumber > nextNumber) {
                numbers[i] = nextNumber;
                numbers[i + 1] = currentNumber;
                change = true;


            }

        }
        return change ? sort(numbers) : numbers;
    }
}
