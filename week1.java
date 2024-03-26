package partice2;
import java.util.Scanner;

public class week1 {

	public static void main(String[] args) {
		
		System.out.println("2자리수 정수 입력(10~99)");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number < 100 && number > 9) {
			if(number % 11 == 0) {
				System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
			}
			else {
				System.out.print("No! 10의 자리와 1의 자리가 같지않습니다.");
			}
		}
		else {
			System.out.println(number + "은(는) 10 ~ 99 자리의 정수가 아닙니다");
		}
		
		

	}

}
