package pw.javbus.test;

public class ArrayTest {
	static char[] a = "hello world".toCharArray();
	
	public static void main(String[] args) {
		int len = a.length;
//		char c = a[12];
		boolean flag = a.equals(new Object());
		char d = a[0];
		Class<? extends char[]> cc = a.getClass();
		System.out.println("len:" + len + ", flag: " + flag + ", d: " + d + ", cc: " + cc);
	}
}
