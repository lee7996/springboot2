package pw.javbus.factory;

public class BenzFactory implements CarFactory {

	@Override
	public Car produce() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}
