package pw.javbus.test;

public class StaticTest {
	private static int x = 100;
	
	public static void main(String[] args) {
		StaticTest obj1 = new StaticTest();
		obj1.x++;
		System.out.println(x);
		StaticTest obj2 = new StaticTest();
		obj2.x++;
		System.out.println(x);
		obj1 = new StaticTest();
		obj1.x++;
		System.out.println(x);
		StaticTest.x--;
		System.out.println(x);
		System.out.println("x: " + x);
	}
}
