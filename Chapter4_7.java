import java.util.Scanner;
class Day{
	private String work; //하루의 할 일을 나타내는 문자열
	public Day() {};
	public void set(String work) { this.work = work;}
	public String get() {return work;}
	public void show() {
		if( work == null ) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}
public class Chapter4_7 {
	

	public static void main(String[] args) {
			Day day[] = new Day[30];
			Scanner sc = new Scanner(System.in);
			System.out.println("이번달 스케쥴 관리 프로그램.");
			while(true) {
				System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>"); int num = sc.nextInt();
				
				if(num == 1) {
					System.out.print("날짜(1~30)?>>"); int d = sc.nextInt();
					day[d-1] = new Day();
					System.out.print("할일(빈칸없이입력)?>>"); String w = sc.next();
					day[d- 1].set(w);
				}
				else if(num == 2) {
					System.out.print("날짜(1~30)?>>"); int d = sc.nextInt();
					day[d- 1].show();
				}
				else if(num == 3) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				else {
					System.out.println("1~3을 입력해주세요.");
				}
			}
	}

}
