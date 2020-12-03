package idv.moontea.designpattern.creational.abstractfactory;

public class Test {

	public static void main(String[] args) {

		Factory factory1 = new NormalFactory();
		System.out.println(factory1.callMonkey().getClass());
		factory1.callMonkey().speak();
		System.out.println(factory1.callSeal().getClass());
		factory1.callSeal().speak();
		
		Factory factory2 = new CubFactory();
		System.out.println(factory2.callMonkey().getClass());
		factory2.callMonkey().speak();
		System.out.println(factory2.callSeal().getClass());
		factory2.callSeal().speak();
		
	}

}
