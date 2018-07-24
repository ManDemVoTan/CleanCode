/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcleancode;

import com.google.gson.*;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Anh Tuan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        JsonParser jp = new JsonParser();
        Gson gson = new Gson();
        Object json = jp.parse(new FileReader("fileName.json"));
        JsonObject jo = (JsonObject) json;
        JsonObject data = (JsonObject) jo.get("data");
        JsonObject jsonPlanet = (JsonObject) data.get("Planets");

        List<Planet> planets = new ArrayList<>();
        for (String s : jsonPlanet.keySet()) {
            JsonObject planet = (JsonObject) jsonPlanet.get(s);
            Planet p = gson.fromJson(planet, Planet.class);
            planets.add(p);
        }

        planets.forEach(planet -> {
            if (planet.getLongitude() > 180) {
//                System.out.println(planet);
            }
        });

        List<House> houses = new ArrayList<>();
        JsonArray jsonHouses = data.getAsJsonArray("Houses");
        for (JsonElement jsonHouse : jsonHouses) {
            House h = gson.fromJson(jsonHouse, House.class);
            houses.add(h);
        }

        House h1 = houses.get(0);
        House h2 = houses.get(1);

        planets.forEach(planet -> {
            if (planet.getLongitude() > h1.longitude && planet.getLongitude() < h2.longitude) {
                System.out.println(planet);
            }

        });


    }
}


