package day20250701;

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input.txt의 내용 - ");
        String line = in.nextLine();
        System.out.println(line);
        in.close();
    }
}