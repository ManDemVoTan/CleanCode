package testcleancode;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JSONReader {

    private static JsonParser jp = new JsonParser();
    private static Gson gson = new Gson();

    public static JsonObject readFromFile(String path) {
        JsonObject json = new JsonObject();
        try {
            FileReader reader = new FileReader(path);
            json = (JsonObject) jp.parse(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return json;
    }
}
