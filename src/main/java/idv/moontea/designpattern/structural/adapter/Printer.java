package idv.moontea.designpattern.structural.adapter;

public abstract class Printer {
	
	public String data;

	public void print(String data) {
		System.out.println("原生介面print方法");
		System.out.println(data);
	}

	public void work() {
		print(data);
	}
}
