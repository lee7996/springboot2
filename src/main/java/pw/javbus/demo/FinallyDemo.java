package pw.javbus.demo;

public class FinallyDemo {
	
	public int test() {
		int x = 1;
	       try
	       {
	            x++;
	            System.out.println("try: " + x);
	           return x;
	       }
	       finally
	       {
	           ++x;
	           System.out.println("finally:" + x);
	       }
	 }
}
