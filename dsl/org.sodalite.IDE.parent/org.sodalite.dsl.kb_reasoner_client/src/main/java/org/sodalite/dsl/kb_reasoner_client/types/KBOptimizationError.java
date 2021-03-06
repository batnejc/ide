package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KBOptimizationError extends KBError{

	String path;
	String value;
	
	public String getPath() {
		return path;
	}

	public String getValue() {
		return value;
	}

	@JsonProperty("info")
	private void unpackNameFromNestedObject(Map<String, String> info) {
		context = info.get("context");
		description = info.get("description");
		path = info.get("path");
		value = info.get("value");
	}

}
