package idv.moontea.designpattern.structural.adapter;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlAdaptee implements Adaptee {

	private String xmlStr;

	public XmlAdaptee(String xmlStr) {
		this.xmlStr = xmlStr;
	}

	@Override
	public String toJsonString() {
		try {
			XmlMapper xmlMapper = new XmlMapper();
			JsonNode node = xmlMapper.readTree(xmlStr.getBytes());
			ObjectMapper jsonMapper = new ObjectMapper();
			String json = jsonMapper.writeValueAsString(node);
			return json;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

}
