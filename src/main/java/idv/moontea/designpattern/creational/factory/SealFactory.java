package idv.moontea.designpattern.creational.factory;

public class SealFactory implements Factory {

	@Override
	public CubEmp call() {
		return new Seal();
	}

}
