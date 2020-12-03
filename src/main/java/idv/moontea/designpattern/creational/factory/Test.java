package idv.moontea.designpattern.creational.factory;

public class Test {

	public static void main(String[] args) {

		Factory factory1 = new MonkeyFactory();
		Factory factory2 = new SealFactory();

		CubEmp empA = factory1.call();
		CubEmp empB = factory2.call();

		System.out.println(empA.getClass());
		empA.speak();

		System.out.println(empB.getClass());
		empB.speak();

	}

}
