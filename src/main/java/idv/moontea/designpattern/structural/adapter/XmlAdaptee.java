package idv.moontea.designpattern.structural.adapter;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlAdaptee implements Adaptee {

	public XmlAdaptee() {
	}

	@Override
	public void toJsonString(String xmlStr) {
		try {
			XmlMapper xmlMapper = new XmlMapper();
			JsonNode node = xmlMapper.readTree(xmlStr.getBytes());
			ObjectMapper jsonMapper = new ObjectMapper();
			String json = jsonMapper.writeValueAsString(node);
			System.out.println(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
