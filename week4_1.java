package javaprograming;
import java.util.Scanner;

public class week4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("입력을 마치려면 'exit'을 입력하세요.");

        while (true) {
            String input = scanner.next();

            if (input.equals("exit")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                sum += num;
            } catch (NumberFormatException e) {
            	
                continue;
            }
        }
        System.out.println("입력된 정수의 합: " + sum);
        scanner.close();
    }
}
