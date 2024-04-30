class Point{
	private int x,y;
	public void setXY(int x, int y) {this.x = x; this.y = y;}
	public Point() {this.x = 0; this.y = 0;}
	public int getX() {return x;}
	public int getY() {return y;}
}

class ColorPoint extends Point{
	private String Color;
	public void setColor(String Color) {this.Color = Color;}
	public ColorPoint(int x, int y, String Color) {setXY(x, y); this.Color = Color;}
	public String toString() {String str = Color + "색의 (" + getX() + "," + getY() + ")의 점"; return str;}
}

public class week9_1 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다");

	}

}
