package pw.javbus.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		Callable<Integer> ct1 = new CallableTest();
		Callable<Integer> ct2 = new CallableTest();
		Callable<Integer> ct3 = new CallableTest();
		Callable<Integer> ct4 = new CallableTest();
		Callable<Integer> ct5 = new CallableTest();
		Future<Integer> result1 = es.submit(ct1);
		Future<Integer> result2 = es.submit(ct2);
		Future<Integer> result3 = es.submit(ct3);
		Future<Integer> result4 = es.submit(ct4);
		Future<Integer> result5 = es.submit(ct5);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
