package idv.moontea.designpattern.creational.abstractfactory;

public class CubFactory implements Factory {

	@Override
	public Monkey callMonkey() {
		return new AngryMonkey();
	}

	@Override
	public Seal callSeal() {
		return new SaltSeal();
	}

}
