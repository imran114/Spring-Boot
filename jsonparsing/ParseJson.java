package com.merge.api.jsonparsing;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class ParseJson {

    public void getKey(JSONObject json, String key){
        boolean exists = json.has(key);
        Iterator<?> keys;
        String nextKeys;
        if (!exists){
            keys = json.keys();
            while (keys.hasNext()){
                nextKeys = (String) keys.next();
                try{
                    if (json.get(nextKeys) instanceof JSONObject){
                        if (exists == false){
                            getKey(json.getJSONObject(nextKeys),key);
                        }
                    }
                    else if (json.get(nextKeys) instanceof JSONArray){
                        JSONArray jsonArray = json.getJSONArray(nextKeys);
                        for (int i=0;i<jsonArray.length();i++){
                            String jsonArrayString = jsonArray.get(i).toString();
                            JSONObject innerJson = new JSONObject(jsonArrayString);
                            if (exists == false){
                                getKey(innerJson,key);
                            }
                        }
                    }
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        else {
            System.out.println(json.get(key));
        }
    }

    public static void main(String[] args) {
        ParseJson parseJson  = new ParseJson();
        String json = "";
        JSONObject input = new JSONObject(json);
        parseJson.getKey(input,"");
    }
}
