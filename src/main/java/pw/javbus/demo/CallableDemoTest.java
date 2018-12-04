package pw.javbus.demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.stereotype.Component;

@Component
public class CallableDemoTest {
	public void callableTest() throws InterruptedException, ExecutionException {
		//创建线程池
		ExecutorService ser = Executors.newFixedThreadPool(2);
		CallableDemo thread1 = new CallableDemo("乌龟",3000);
		CallableDemo thread2 = new CallableDemo("兔子",500);
		
		Future<Integer> result1 = ser.submit(thread1);
		Future<Integer> result2 = ser.submit(thread2);
		Thread.sleep(6000);
		thread1.setFlag(false);
		thread2.setFlag(false);
		System.out.println("乌龟跑了"+result1.get()+"步");
		System.out.println("兔子跑了"+result2.get()+"步");
		ser.shutdownNow();
	}
}

class Demo {
	
}
