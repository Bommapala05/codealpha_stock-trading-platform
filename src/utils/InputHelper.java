package utils;

import java.util.Scanner;

public class InputHelper {

    private static Scanner scanner =
            new Scanner(System.in);

    public static int getIntInput(
            String message) {

        System.out.print(message);

        return scanner.nextInt();
    }

    public static String getStringInput(
            String message) {

        System.out.print(message);

        return scanner.next();
    }
}