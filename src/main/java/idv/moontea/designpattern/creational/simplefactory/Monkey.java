package idv.moontea.designpattern.creational.simplefactory;

public class Monkey implements CubEmp {

	@Override
	public String speak() {
		System.out.println("吱吱吱");
		return this.getClass().getSimpleName();
	}

}
