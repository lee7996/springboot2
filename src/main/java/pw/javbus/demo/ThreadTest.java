package pw.javbus.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
//		Executors.newScheduledThreadPool(2);  //定长、支持定时及周期性任务执行的线程池
//		Executors.newFixedThreadPool(2);   定长线程池
//		Executors.newCachedThreadPool();  可缓存线程池  可根据当前任务数量自动变更线程池长度
//		Executors.newSingleThreadExecutor();   单线程化的线程池，保证任务按照指定顺序(FIFO, LIFO, 优先级)执行进行
		Map map = new LinkedHashMap();
		Callable<Integer> ct1 = new CallableTest();
//		Callable<Integer> ct2 = new CallableTest();
//		Callable<Integer> ct3 = new CallableTest();
//		Callable<Integer> ct4 = new CallableTest();
//		Callable<Integer> ct5 = new CallableTest();
		Future<Integer> result1 = es.submit(ct1);
		Future<Integer> result2 = es.submit(ct1);
		Future<Integer> result3 = es.submit(ct1);
		Future<Integer> result4 = es.submit(ct1);
		Future<Integer> result5 = es.submit(ct1);
		ThreadTest.roll();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static int roll() {
		for (int i = 0; i < 100; i++) {
			if(i == 50) {
				System.out.println("停止");
				return i;
			}
			System.out.println(i);
		}
		return -1;
	}
}
