import java.util.Scanner;
public class week2_2 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		char c = scanner.next().charAt(0);
		
		if(c>='a' && c<='z');{
			for(char b = c; b>='a'; b--) {
				for(char a = 'a'; a <= b; a++) {
					System.out.print(a);
				}
				System.out.print("\n");
			}
		}
		scanner.close();
	}
	
}
