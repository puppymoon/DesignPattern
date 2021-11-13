package idv.moontea.designpattern.structural.adapter;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapAdaptee implements Adaptee {

	private Map map;

	public MapAdaptee(Map map) {
		this.map = map;
	}

	@Override
	public String toJsonString() {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

}
