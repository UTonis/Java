import java.util.Scanner;
abstract class Shape{
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;}
	public Shape getNext() {return next;}
	public abstract void draw();
}
class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}
class GraphicEditor{
	Shape start;
	Shape last;
	void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				num = sc.nextInt();
				insert(num);
			}
			else if(num == 2) {
				System.out.print("삭제할 도형의 위치>>");
				num = sc.nextInt();
				delete(num);
			}
			else if(num == 3) {
				print();
			}
			else if(num == 4) {
				System.out.println("beauty을 종료합니다.");
				break;
			}
			else {
				System.out.println("1~4를 입력해주세요.");
			}
		}
	}
	void insert(int num) {
		if(start==null) 
		{
			if(num == 1) {
				start=new Line();
				last=start;
			}
			else if(num == 2) {
				start=new Rect();
				last=start;
			}
			else if(num == 3) {
				start=new Circle();
				last=start;
			}
			else {
				System.out.println("1~3를 입력해주세요.");
			}
		}
		else 
		{
			if(num == 1) {
				Shape s;
				s=new Line();
				last.setNext(s);
				last=s;
			}
			else if(num == 2) {
				Shape s;
				s=new Rect();
				last.setNext(s);
				last=s;
			}
			else if(num == 3) {
				Shape s;
				s=new Circle();
				last.setNext(s);
				last=s;
			}
			else {
				System.out.println("1~3를 입력해주세요.");
			}
		}
		
	}
	void delete(int num) {
		Shape temp = null;
		for(int i= 1; i <= num + 1; i++) {
			temp = start.getNext();
		}
		if(temp != null) {
			for(int i = 1; i < num; i++) {
				if(i == num-1) {
					start.setNext(temp.getNext());
				}
			}
		}
		else {
			System.out.println("삭제할 수 없습니다.");
		}
	}
	void print() {
		Shape startPos=start;
		while(startPos!=null) {
			startPos.draw();
			startPos = startPos.getNext();
		}
	}
}
public class week10_1 {
	public static void main(String args[]) {
		GraphicEditor g = new GraphicEditor();
		g.run();
	}
}
