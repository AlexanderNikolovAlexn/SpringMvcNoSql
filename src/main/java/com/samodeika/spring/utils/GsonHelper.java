package com.samodeika.spring.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GsonHelper<T> {

    private Gson json;

    public GsonHelper() {
        json = new Gson();
    }

    public String produceJson(T element) {
        JsonObject jsonObject = new JsonObject();
        JsonElement jsonElement = json.toJsonTree(element);
        jsonObject.add(element.getClass().getSimpleName(), jsonElement);
        return jsonObject.toString();
    }

    public String produceJson(List<T> elements) {
        JsonArray jsonArray = new JsonArray();
        for (T el: elements) {
            JsonElement jsonElement = json.toJsonTree(el);
            JsonObject jsonObject = new JsonObject();
            jsonObject.add(el.getClass().getSimpleName(), jsonElement);
            jsonArray.add(jsonObject);
        }
        return jsonArray.toString();
    }

}
