package pw.javbus.test;

public class GetValueTest {
	private int i = getValue();
	private int j = 10;
	int getValue() {
		return j;
	}
	
	public static void main(String[] args) {
		System.out.println(new GetValueTest().i);
	}
}
