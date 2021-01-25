package com.home_Work_Lesson_6_EX5;

import com.home_Work_Lesson_6_EX5.arraySorting.ArraySorting;
import com.home_Work_Lesson_6_EX5.except.ExceptArray;

import java.util.Scanner;

public class Launch {


   /* Написать метод, который возвращает пропущенное число в массиве.
    На вход метод будет принимать массив целых чисел, числа будут отличаться на 1. массив может быть не отсортирован.
    Например, массив 1,4,2,5 -> пропущенно число 3
     */



    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("Press a size of array (>1): ");
        int size = s.nextInt();

        if (size < 2){                                      // no gaps with size array = 1
            throw new ExceptArray("Wrong input array!");
        }
        int[] array = new int[size];                        // array created

        System.out.println("Press a number: ");
        for (int i = 0; i < array.length; i++) {            // array initialized
            array[i] = s.nextInt();
        }

        s.close();                                    // scanner closed
        ArraySorting.searcherMissElement(array);
    }
}
