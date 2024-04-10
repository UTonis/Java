import java.util.Scanner;

public class week5_1 {

	static class Phone{

		private String name, tel;
 
		Phone(String name, String tel){
			this.name = name;
			this.tel = tel;
		}
}


public static void main(String[] args) {


try {

	System.out.print("인원수>>");

	Scanner sc = new Scanner(System.in);


	int size = sc.nextInt();

	Phone p[] = new Phone[size];


	for(int i =0; i < size; i++) {

		System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
		String name = sc.next();
		String tel = sc.next();
		
		p[i] = new Phone(name, tel);
		

	}

	System.out.println("저장되었습니다...");

	do {
		System.out.print("검색할 이름>>");
		String search = sc.next();
		

		if(search.equals("그만")) {

			break;

		}

		else {

			for(int i =0; i < size; i++) {

				if(search.equals(p[i].name)) {

					System.out.println(p[i].name + "의 번호는 " + p[i].tel);

				}
				
				else {

					System.out.println(p[i].name + "이 없습니다.");

				}

			}

		}

	}while(true);


	sc.close();

	}

	catch (Exception e) {

		e.printStackTrace();

	}



	}
}
