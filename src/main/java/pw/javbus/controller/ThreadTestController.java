package pw.javbus.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pw.javbus.demo.ArrayListRemoveElementDemo;
import pw.javbus.demo.CallableDemoTest;

@RestController
public class ThreadTestController {

	@Autowired
	ArrayListRemoveElementDemo arrayListRemoveElementDemo;
	
	@Autowired
	CallableDemoTest callableDemoTest;
	
	@GetMapping("threadTest")
	public void threadTest() {
		arrayListRemoveElementDemo.threadTest();
	}
	
	@GetMapping("callableTest")
	public void callableTest() {
		try {
			callableDemoTest.callableTest();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
