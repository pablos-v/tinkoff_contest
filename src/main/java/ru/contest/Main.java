package ru.contest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] values = new int[4];
        int i = 0;

        while (scanner.hasNext() && i <= 3) {
            if (scanner.hasNextInt()) {
                values[i++] = scanner.nextInt();
            } else scanner.next();
        }
        scanner.close();

        int overRun = Math.max(values[3] - values[1], 0);
        int res = (overRun * values[2]) + values[0];

        System.out.println(res);
    }
}