/*******************************************************************************
 * Copyright (c) 2019 Atos Spain S.A.
 * This program and the accompanying materials
 * are made available under the terms of the Apache Public License 2.0 (APL2)
 * which accompanies this distribution, and is available at
 * https://apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Jesús Gorroñogoitia - Design and implementation
 *******************************************************************************/
package org.sodalite.dsl.kb_reasoner_client.json;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map.Entry;

import org.sodalite.dsl.kb_reasoner_client.types.Type;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class TypeJsonDeserializer extends JsonDeserializer<Type> {
    private static final ObjectMapper mapper = new ObjectMapper();
    protected JavaType nodeType;
    protected Type type;

	@Override
	public Type deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {
        JsonNode node = mapper.readTree(jsonParser);
    	
    	if (! (node instanceof ObjectNode))
    		return null;
    	
        ObjectNode objectNode = (ObjectNode) node;
        Type type = null;
		try {
			type = new Type();
			if (objectNode.fields().hasNext()) {
				Entry<String, JsonNode> entry = objectNode.fields().next();
				if (entry.getKey()!=null) {
					type.setUri(new URI(entry.getKey()));
				}
				if (entry.getValue()!=null && entry.getValue().get("label")!=null) {
					type.setLabel(entry.getValue().get("label").asText());
				}
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
        
        return type;
	}

}
