package cinema_guide;

import java.util.ArrayList;

/**
 *
 * @author Amr
 */
public class RemoveCinemaCtrl {
    public static ArrayList<String> getCinemasNames(){
        return Cinema.getCinemasNames();
    }
    
    public static void removeCinema(int index){
        Cinema.removeCinema(index);
    }
}
