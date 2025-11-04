package com.example;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class SecondMax {
    public int findSecondMax(int[] numbers) {
        int[] distinctSorted = Arrays.stream(numbers).distinct().sorted().toArray();
                if(distinctSorted.length < 2) {
                    throw new NoSuchElementException("Нет второго максимального элемента");
                }
                return distinctSorted[distinctSorted.length - 2];
    }
}
