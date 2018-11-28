package pw.javbus.factory;

public class BmwFactory implements CarFactory{

	@Override
	public Car produce() {
		// TODO Auto-generated method stub
		return new Bmw();
	}

}
