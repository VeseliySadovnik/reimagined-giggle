package com.example;
import java.util.Arrays;

public class MaxFinderUtils {
    public int findMax(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input array can not be null");
        }
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
