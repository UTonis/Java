import java.util.Scanner;
import java.util.InputMismatchException;

public class chapter3_15 {

	public static void main(String[] args) {
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("곱하고자 하는 두 수 입력>>");
			try {
				
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.println(n + "x" + m + "=" + n*m);
				scanner.close();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("실수를 입력하면 안됩니다.");
			}
		}while(true);
		
	}

}
