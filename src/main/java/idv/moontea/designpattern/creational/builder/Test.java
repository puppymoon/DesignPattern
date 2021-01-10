package idv.moontea.designpattern.creational.builder;

public class Test {

	public static void main(String[] args) {
		
		//use Director
		Builder concreteBuilder = new ConcreteBuilder();
		Director director = new Director(concreteBuilder);
		Product product1 = director.construct("A", "001", "猴猴");
		System.out.println(product1);
		
		//do not use Director
		Product product2 = Product.getBuilder()
				.buildAttr1("B")
				.buildAttr2("002")
				.buildAttr3("海豹")
				.build();
		System.out.println(product2);
		
		
	}

}
