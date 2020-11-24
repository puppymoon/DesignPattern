package idv.moontea.designpattern.creational.simplefactory;

public class Seal implements CubEmp {

	@Override
	public String speak() {
		System.out.println("我要吃!");
		return this.getClass().getSimpleName();
	}

}
