package idv.moontea.designpattern.creational.factory;

public class MonkeyFactory implements Factory {

	@Override
	public CubEmp call() {
		return new Monkey();
	}

}
