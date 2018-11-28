package pw.javbus.demo;

public class YieldTest extends Thread{

	public void myMethod(Object o){
		System.out.println("My Object");
		}
		public void myMethod(String s){
		System.out.println("My String");
		}
		public static void main(String args[]){
			YieldTest t=new YieldTest();
		t.myMethod(null);
		}
}
