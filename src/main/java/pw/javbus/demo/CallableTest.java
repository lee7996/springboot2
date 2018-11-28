package pw.javbus.demo;

import java.util.concurrent.Callable;

public class CallableTest implements Callable<Integer>{

	private Integer x = 0;
	@Override
	public Integer call() throws Exception {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() + "购买了第" + (x+1) + "张票");
				x++;
			}
			return x;
	}

}
