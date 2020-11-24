package idv.moontea.designpattern.creational.simplefactory;

public class Test {

	public static void main(String[] args) {

		// 傳入參數不同，而回傳不同類別，不用知道類別內做的事情
		CubEmp empA = SimpleFactor.callEmp("monkey");
		empA.speak();
		CubEmp empB = SimpleFactor.callEmp("seal");
		empB.speak();
		CubEmp empC = SimpleFactor.callEmp("bird");
		empC.speak();

	}

}
