package pw.javbus.demo;

import org.springframework.stereotype.Component;

/**
 * 多线程实现方式1,继承Thread类
 * @author Lee
 *
 */
@Component
public class ThreadDemo extends Thread {

	@Override
	public void run() {
		synchronized(this) {
			for (int i = 0; i < 100; i++) {
				System.out.println("线程1执行第" + i + "次");
			}
		}
	}

	
}

@Component
class ThreadDemo1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("线程2执行第" + i + "次");
		}
	}

	
}
