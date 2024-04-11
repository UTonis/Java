import java.util.Scanner;

public class week5_2 {

static class consert{
	private String name[] = new String[10];
	
	public consert(String n) {
		for(int i = 0; i < 10; i++) {
				name[i] = n;
			};
		}
	
		void show() {
		for(int i = 0; i < 10; i++) {
			System.out.print(" " + name[i] + " ");
			};
			System.out.print("\n");
		}
		
		String getName(int a)
		{
			return name[a];
		}
		
		void setName(String n, int a) {name[a] = n;}
};


public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	consert S = new consert("---");
	consert A = new consert("---");
	consert B = new consert("---");

	System.out.println("명품콘서트홀 예약 시스템입니다.");

		do {

			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int num = sc.nextInt();

			if(num == 1) {
				System.out.print("이름>>");
				String name = sc.next();
				do {
					System.out.print("좌석구분 S(1), A(2), B(3)");
					int s = sc.nextInt();
					if(s == 1) {
						do {
							System.out.print("번호>>");
							int x = sc.nextInt();
							if(x > 0 && x < 11) {
								if(S.getName(x - 1) != "---") { //이미 좌석이 예매되었을 때
									System.out.println("이미 예약된 좌석입니다.");
								}
								else {
									S.setName(name, x - 1);
									break;
								}
							}
							else {
								System.out.println("1 ~ 10 까지 빈자리를 선택해주세요.");
							}
						}while(true);
					}
					else if(s == 2) {
						do {
							System.out.print("번호>>");
							int x = sc.nextInt();
							if(x > 0 && x < 11) {
								if(A.getName(x - 1) != "---") { //이미 좌석이 예매되었을 때
									System.out.println("이미 예약된 좌석입니다.");
								}
								else {
									A.setName(name, x - 1);
									break;
								}
							}
							else {
								System.out.println("1 ~ 10 까지 빈자리를 선택해주세요.");
							}
						}while(true);
					}
					else if(s == 3) {
						do {
							System.out.print("번호>>");
							int x = sc.nextInt();
							if(x > 0 && x < 11) {
								if(B.getName(x - 1) != "---") { //이미 좌석이 예매되었을 때
									System.out.println("이미 예약된 좌석입니다.");
								}
								else {
									B.setName(name, x - 1);
									break;
								}
							}
							else {
								System.out.println("1 ~ 10 까지 빈자리를 선택해주세요.");
							}
						}while(true);
					}else {
						System.out.println("1 ~ 3를 입력해주세요.");
					}
					break;
				}while(true);
				
			}	

			else if(num == 2) {
				System.out.print("S>> ");
				S.show();
				System.out.print("\nA>> ");
				A.show();
				System.out.print("\nB>> ");
				B.show();
				System.out.println("<<조회를 완료하였습니다.>>");
			}

			else if(num == 3) {
				System.out.print("좌석 S:1, A:2, B:3 >>");
				int s = sc.nextInt();
				if(s == 1) {
					System.out.print("S>>");
					S.show();
					System.out.print("이름>>");
					String name = sc.next();
					for(int i = 0; i < 10; i++) {
						if(S.getName(i).equals(name)) {
							S.setName("---", i); 
							break;
						}
						else {
							if(i == 10) {
								System.out.println(name + "은 예약자 명단에 없습니다.");
							}
						}
					}
				}
				else if(s == 2) {
					System.out.print("A>>");
					A.show();
					System.out.print("이름>>");
					String name = sc.next();
					for(int i = 0; i < 10; i++) {
						if(A.getName(i).equals(name)) {
							A.setName("---", i); 
							break;
						}
						else {
							if(i == 10) {
								System.out.println(name + "은 예약자 명단에 없습니다.");
							}
						}
					}
				}
				else if(s == 3) {
					System.out.print("B>>");
					B.show();
					System.out.print("이름>>");
					String name = sc.next();
					for(int i = 0; i < 10; i++) {
						if(B.getName(i).equals(name)) {
							B.setName("---", i); 
							break;
						}
						else {
							if(i == 10) {
								System.out.println(name + "은 예약자 명단에 없습니다.");
							}
						}
					}
				}
				else {
					System.out.println("1 ~ 3을 입력해주세요.");
				}
				
			}

			else if(num == 4) {
				break;
			}else {

			System.out.println("1 ~ 4를 입력해주세요.");

			}

		}while(true);
		
		
	}
}
