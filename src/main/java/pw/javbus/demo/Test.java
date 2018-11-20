package pw.javbus.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Test {
	@Autowired
	private ThreadDemo thread1;
	@Autowired
	private ThreadDemo1 thread2;
	
	public void threadGo(){
		thread1.start();
		thread2.start();
	}
}
