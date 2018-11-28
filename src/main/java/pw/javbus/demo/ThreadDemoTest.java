package pw.javbus.demo;


public class ThreadDemoTest {
	
	public static void main(String[] args) {
		ThreadDemo thread1 = new ThreadDemo();
//		ThreadDemo1 thread2 = new ThreadDemo1();
		ThreadDemo thread2 = new ThreadDemo();
		thread1.start();
		thread2.start();
	}
}
