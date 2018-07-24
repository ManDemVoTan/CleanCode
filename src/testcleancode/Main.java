/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcleancode;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;

/**
 *
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

        JsonObject planets = (JsonObject) data.get("Planets");

        
        for (String s : planets.keySet()) {
            JsonObject planet = (JsonObject) planets.get(s);
            Planets p = gson.fromJson(planet, Planets.class);

            if (p.getLongitude() >= 180) {
                System.out.println(p);
            }

        }

    }
}

class Planets {

    double longitude;
    int sign;
    String signName;
    int degrees;
    int minutes;
    String position_string;
    boolean retrograde;
    String name;
    int house;

    public Planets() {
    }

    public Planets(double longitude, int sign, String signName, int degrees, int minutes, String position_string, boolean retrograde, String name, int house) {
        this.longitude = longitude;
        this.sign = sign;
        this.signName = signName;
        this.degrees = degrees;
        this.minutes = minutes;
        this.position_string = position_string;
        this.retrograde = retrograde;
        this.name = name;
        this.house = house;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getSign() {
        return sign;
    }

    public void setSign(int sign) {
        this.sign = sign;
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public int getDegrees() {
        return degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getPosition_string() {
        return position_string;
    }

    public void setPosition_string(String position_string) {
        this.position_string = position_string;
    }

    public boolean isRetrograde() {
        return retrograde;
    }

    public void setRetrograde(boolean retrograde) {
        this.retrograde = retrograde;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Planets{" + "longitude=" + longitude + ", sign=" + sign + ", signName=" + signName + ", degrees=" + degrees + ", minutes=" + minutes + ", position_string=" + position_string + ", retrograde=" + retrograde + ", name=" + name + ", house=" + house + '}';
    }

}
