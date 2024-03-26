import java.util.Scanner;

public class week2_1 {
public static void main (String args[]) {
	Scanner scanner = new Scanner(System.in);
	int x1, y1, r1, x2, y2, r2 = 0;
	
	System.out.print("첫 번째 원의 중심과 반지름 입력>>");
	x1 = scanner.nextInt();
	y1 = scanner.nextInt();
	r1 = scanner.nextInt();
	System.out.print("두 번째 원의 중심과 반지름 입력>>");
	x2 = scanner.nextInt();
	y2 = scanner.nextInt();
	r2 = scanner.nextInt();
	
	int n1 = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
	int n2 = (r1+r2)*(r1+r2);
	
	if(n1 > n2) {
		System.out.print("두 원은 서로 겹치지 않는다.");
	}
	else {
		System.out.print("두 원은 서로 겹친다.");
	}
	
	scanner.close();
}
}
