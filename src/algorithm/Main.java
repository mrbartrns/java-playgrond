package algorithm;

import java.util.Scanner;
import algorithm.B2525;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        B2525 solution = new B2525();
        int[] answer = solution.solve(a, b, c);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
