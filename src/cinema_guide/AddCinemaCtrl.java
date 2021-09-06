package cinema_guide;

/**
 *
 * @author Amr
 */
public class AddCinemaCtrl {
    public static void AddCinema(String name, String loc, int ticketPrice){
        Cinema c = new Cinema(name, loc, ticketPrice);
    }
     public static boolean CinemaAlreadyExist(String namee){
       return Cinema.CinemaAlreadyExist(namee);
    
    }
}
