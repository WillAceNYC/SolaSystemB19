package SolarSystem;

public class solarSystem {
    public static void main(String[] args) {

        solarSystemBase solar = new solarSystemBase();
        solar.sun = "1";
        solar.planet = "2";
        solar.star = "2";
        System.out.println("the solar system is ready");



        planet1 renox = new planet1();
        renox.color = "grey";
        renox.size = "10km";
        renox.radius = "5m";

        planet2 perox = new planet2();
        perox.color = "green";
        perox.size = "1m";
        perox.radius = "3m";


    }
}
