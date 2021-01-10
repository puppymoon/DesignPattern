package idv.moontea.designpattern.creational.builder;

public class ConcreteBuilder implements Builder {

	private Product product;

	public ConcreteBuilder() {
		product = new Product();
	}

	@Override
	public Builder buildAttr1(String attr) {
		product.setAttr1(attr);
		return this;
	}

	@Override
	public Builder buildAttr2(String attr) {
		product.setAttr2(attr);
		return this;
	}

	@Override
	public Builder buildAttr3(String attr) {
		product.setAttr3(attr);
		return this;
	}

	@Override
	public Product build() {
		return product;
	}

}
