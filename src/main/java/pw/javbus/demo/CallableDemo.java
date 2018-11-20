package pw.javbus.demo;

import java.util.concurrent.Callable;

/**
 * 带返回值的线程实现
 * @author Lee
 *
 */
public class CallableDemo implements Callable<Integer>{
	private String name;
	private long time;
	private int num;
	private boolean flag = true;
	
	@Override
	public Integer call() throws Exception {
		while(flag) {
			Thread.sleep(time);
			num++;
		}
		// TODO Auto-generated method stub
		return num;
	}
	
	
	public CallableDemo(String name, long time) {
		super();
		this.name = name;
		this.time = time;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	

}
