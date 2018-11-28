package pw.javbus.factory;

public class FactotyTest {
	public static void main(String[] args) {
		CarFactory cf = new BenzFactory();
		CarFactory cf2 = new BmwFactory();
		cf.produce().brand();
		cf2.produce().brand();
	}
}
