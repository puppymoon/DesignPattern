package idv.moontea.designpattern.creational.builder;

public interface Builder {

	public Builder buildAttr1(String attr);

	public Builder buildAttr2(String attr);

	public Builder buildAttr3(String attr);

	public Product build();

}
