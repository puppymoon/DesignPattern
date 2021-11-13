package idv.moontea.designpattern.structural.adapter;

public class Test {

	public static void main(String[] args) {

		String jsonStr = "{\"car\":\"test\",\"price\":\"5566\"}";
		Printer jsonPrinter = new JsonPrinter();
		jsonPrinter.print(jsonStr);
		
		String xmlStr = "<Base><car>test</car><price>5566</price></Base>";
		Printer xmlPrinter = new Adapter(new XmlAdaptee());
		xmlPrinter.print(xmlStr);
	}

}
