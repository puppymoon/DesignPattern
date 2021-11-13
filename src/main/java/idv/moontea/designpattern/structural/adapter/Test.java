package idv.moontea.designpattern.structural.adapter;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		String jsonStr = "{\"car\":\"test\",\"price\":\"5566\"}";
		Printer jsonPrinter = new JsonPrinter(jsonStr);
		jsonPrinter.work();

		String xmlStr = "<Base><car>test</car><price>5566</price></Base>";
		Printer xmlPrinter = new Adapter(new XmlAdaptee(xmlStr));
		xmlPrinter.work();

		Map map = new HashMap();
		map.put("car", "test");
		map.put("price", "5566");
		Printer mapPrinter = new Adapter(new MapAdaptee(map));
		mapPrinter.work();

	}

}
