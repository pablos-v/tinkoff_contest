package ru.contest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForTestTest {

    ForTest forTest = new ForTest();
    long memoryBefore;
    long startTime;

    @BeforeEach
    public void countersInit() {
        memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        startTime = System.currentTimeMillis();
    }

    @AfterEach
    public void countersResult() {
        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long endTime = System.currentTimeMillis();

        long consumedMemory = memoryAfter - memoryBefore;
        long executionTime = endTime - startTime;

        System.out.println("Потреблено памяти: " + (double) consumedMemory / 1024 + " Кбайт");
        System.out.println("Время выполнения: " + (double) executionTime / 1000 + " секунд");
    }

    @Test
    void method() {
        int[] input = {2, 4, 5, 6, 8, 9, 10, 15, 16, 17};
        int[] response = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            response[i] = forTest.method(input[i]);
        }

        int[] expected = {1, 2, 3, 3, 3, 4, 4, 4, 4, 5};

        assertEquals(Arrays.toString(expected), Arrays.toString(response));
    }
}