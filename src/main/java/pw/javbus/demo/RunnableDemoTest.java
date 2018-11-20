package pw.javbus.demo;

public class RunnableDemoTest {
	public static void main(String[] args) {
		RunnableDemo r = new RunnableDemo();
		Thread thread1 = new Thread(r,"老王");
		Thread thread2 = new Thread(r,"王二麻子");
		Thread thread3 = new Thread(r,"董存瑞");
		thread1.start();
		thread2.start();
		thread3.start();
	} 
}
