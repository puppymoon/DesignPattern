package idv.moontea.designpattern.structural.adapter;

public class JsonPrinter implements Printer {

	@Override
	public void print(String data) {
		System.out.println("使用JsonPrinter");
		System.out.println(data);
	}

}
