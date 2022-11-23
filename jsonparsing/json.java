package com.merge.api.jsonparsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;

public class json {
    static ObjectMapper objectMapper = getObjectMapper();

    public static ObjectMapper getObjectMapper(){
        ObjectMapper defaultObjectMapper = new ObjectMapper();
        return defaultObjectMapper;
    }
    public static JsonNode parse(String src){
        try {
            return objectMapper.readTree(src.toString());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
