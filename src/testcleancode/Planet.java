package testcleancode;

class Planet {

    private double longitude;
    private int sign;
    private String signName;
    private int degrees;
    private int minutes;
    private String position_string;
    private boolean retrograde;
    private String name;
    private int house;

    public Planet() {
    }

    public Planet(double longitude, int sign, String signName, int degrees, int minutes, String position_string, boolean retrograde, String name, int house) {
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
        return "Planet{" + "longitude=" + longitude + ", sign=" + sign + ", signName=" + signName + ", degrees=" + degrees + ", minutes=" + minutes + ", position_string=" + position_string + ", retrograde=" + retrograde + ", name=" + name + ", house=" + house + '}';
    }

    public void setNameWithAge(String name, int age){
        if (age <= 0){
            System.out.println("loi cmnr");
        } else {

        }
    }

}
