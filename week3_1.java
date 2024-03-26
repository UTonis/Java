package javaprograming;
import java.util.Scanner;

public class week3_1 {
    public static void main(String[] args) {
        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};
        String stop = "그만";

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("과목 이름>>");
            String name = scanner.next();
            
            if (stop.equals(name)) {
                break;
            }
            
            boolean found = false;
            for (int i = 0; i < 5; i++) {
                if (course[i].equals(name)) {
                    System.out.println(name + " 점수는 " + score[i]);
                    found = true;
                    break;
                }
            }
            
            if (found == false) {
                System.out.println("없는 과목입니다.");
            }
        }
        
        scanner.close();
    }
}
