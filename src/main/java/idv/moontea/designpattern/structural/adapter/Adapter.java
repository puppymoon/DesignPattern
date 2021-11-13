package idv.moontea.designpattern.structural.adapter;

public class Adapter extends Printer {

	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void work() {
		print(adaptee.toJsonString());
	}

}
