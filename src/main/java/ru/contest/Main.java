package ru.contest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println((int) Math.ceil(Math.log10(scanner.nextInt()) / Math.log10(2)));
    }

    public static int divide(int n) {
        double log = Math.log10(n)/Math.log10(2);
        return (int) Math.ceil(log);
    }

}