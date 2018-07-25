
package testcleancode;

import com.google.gson.*;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        JsonObject json = JSONReader.readFromFile("fileName.json");
        Gson gson = new Gson();
        JsonObject data = (JsonObject) json.get("data");
        
        JsonObject jsonPlanet = (JsonObject) data.get("Planets");
        List<Planet> planets = new ArrayList<>();
        
        for (String s : jsonPlanet.keySet()) {
            JsonObject planet = (JsonObject) jsonPlanet.get(s);
            Planet p = gson.fromJson(planet, Planet.class);
            planets.add(p);
        }

        planets.forEach(planet -> {
            if (planet.getLongitude() > 180) {

            }
        });
        
        
        JsonArray jsonHouses = data.getAsJsonArray("Houses");
        List<House> houses = new ArrayList<>();

        for (JsonElement jsonHouse : jsonHouses) {
            House house = gson.fromJson(jsonHouse, House.class);
            houses.add(house);
        }

        House houseone = houses.get(0);
        House housetwo = houses.get(1);

        planets.forEach(planet -> {
            if (planet.getLongitude() > houseone.longitude && planet.getLongitude() < housetwo.longitude) {
                System.out.println(planet);
            }

        });
    }
}
