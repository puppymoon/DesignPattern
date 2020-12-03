package idv.moontea.designpattern.creational.abstractfactory;

public class NormalFactory implements Factory {

	@Override
	public Monkey callMonkey() {
		return new NormalMonkey();
	}

	@Override
	public Seal callSeal() {
		return new NormalSeal();
	}

}
