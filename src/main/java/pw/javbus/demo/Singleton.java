package pw.javbus.demo;

public class Singleton {
	private Integer num;
	private static Singleton singleton = null;
	
	private Singleton() {
		this.num = 100;
	};
	
	public static Singleton getInstance() {
		if(singleton == null) {
			synchronized(Singleton.class) {
				if(singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
	
	
}
