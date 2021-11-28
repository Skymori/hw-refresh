package hw13.defaults;

import hw13.entity.Geo;

public class DefaultGeo {
    public static Geo createDefaultGeo(){
        Geo geo = new Geo();
        geo.setLat(-4.454);
        geo.setLng(-54.6543);
        return geo;
    }
}
