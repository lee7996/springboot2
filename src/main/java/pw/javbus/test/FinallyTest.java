package pw.javbus.test;

public class FinallyTest {

	public static void main(String[] args) {
		try {
				System.out.println("try");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("catch");
			} finally {
				System.out.println("finally");
			}
	}
}
