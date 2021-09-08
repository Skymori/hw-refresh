package hw_4;

public class PlanetTester {
    String test(SpaceObject object){
        if (object instanceof Planet){
            return "planet";
        }else
            return "not planet";
    }
}

