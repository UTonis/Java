import java.util.Scanner;
class Add{
	private int a;
	private int b;
	public void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {return a + b;}
}
class Sub{
	private int a;
	private int b;
	public void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {return a - b;}
}
class Mul{
	private int a;
	private int b;
	public void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {return a * b;}
}
class Div{
	private int a;
	private int b;
	public void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {return a / b;}
}
public class Calculate {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next();
		
		if(c.equals("+")) {
			Add add = new Add();
			add.SetValue(a, b);
			System.out.println(add.calculate());
		}
		if(c.equals("-")) {
			Sub sub = new Sub();
			sub.SetValue(a, b);
			System.out.println(sub.calculate());
		}
		if(c.equals("*")) {
			Mul mul = new Mul();
			mul.SetValue(a, b);
			System.out.println(mul.calculate());
		}
		if(c.equals("/")) {
			Div div = new Div();
			div.SetValue(a, b);
			System.out.println(div.calculate());
		}
		sc.close();
	}
}
