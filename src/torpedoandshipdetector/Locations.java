package torpedoandshipdetector;

import java.util.ArrayList;


public class Locations {
    ArrayList<Location> locationList=new ArrayList<>() ;
    public void Add(Location loc) {
        locationList.add(loc) ;
    }
    public void Dump(String message) {
        System.out.println(message);
        locationList.forEach( (Location l) -> {
            System.out.println("Start X:"+l.getStartX()+" Start Y:"+l.getStartY() ) ;
        });
        System.out.println("------------------------------" );
    }
}
