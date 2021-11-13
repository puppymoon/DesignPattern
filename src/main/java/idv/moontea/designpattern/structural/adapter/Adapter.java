package idv.moontea.designpattern.structural.adapter;

public class Adapter implements Printer {

	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void print(String data) {
		System.out.println("使用Adapter,原始字串: " + data);
		adaptee.toJsonString(data);
	}

}
