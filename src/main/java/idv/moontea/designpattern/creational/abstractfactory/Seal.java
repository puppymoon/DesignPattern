package idv.moontea.designpattern.creational.abstractfactory;

public abstract class Seal {

	protected String flavor;

	public void speak() {
		System.out.println("我是" + flavor + "小海豹");
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	};

}
