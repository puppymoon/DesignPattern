package idv.moontea.designpattern.creational.builder;

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public Product construct(String attr1,String attr2,String attr3) {
		return builder
				.buildAttr1(attr1)
				.buildAttr2(attr2)
				.buildAttr3(attr3)
				.build();
	}

}
