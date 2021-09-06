package cinema_guide;

import java.util.ArrayList;

/**
 *
 * @author Amr
 */
public class AddHallCtrl {
    public static ArrayList<String> getCinemasNames(){
        return Cinema.getCinemasNames();
    }
    
    public static void addHall(int cinemaIndex){
        
        Hall h = new Hall();
        Cinema.addHall(cinemaIndex, h);
    }
    
}


