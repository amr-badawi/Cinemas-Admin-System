package cinema_guide;

import java.util.ArrayList;

/**
 *
 * @author Amr
 */
public class Cinema {
    private String name;
    private String location;
    private int ticketPrice;
    private int Hallcount;
    
    public ArrayList<Hall> halls = new ArrayList();
    
    
    private static ArrayList<Cinema> cinemas = new ArrayList();

    public Cinema(String name, String location, int ticketPrice) {
        this.name = name;
        this.location = location;
        this.ticketPrice = ticketPrice;
        this.Hallcount=0;
        
        
        cinemas.add(this);
    }
    
    public static ArrayList<String> getCinemasNames(){
        ArrayList<String> names = new ArrayList<>();
        for(Cinema c: cinemas)
            names.add(c.name);
        return names;
    }
    public static boolean CinemaAlreadyExist(String namee){
        for(Cinema c : cinemas)
        { if (c.name.equalsIgnoreCase(namee))
            return true;
         }
        return false;
    
    }
    public static void removeCinema(int index){
        cinemas.remove(index);
    }
    
     public static ArrayList<Integer> getHallnumbersofCinema(int cinemaIndex){
        ArrayList<Integer> hallnumbers = new ArrayList<>();
        Cinema c = cinemas.get(cinemaIndex);
        for(Hall h: c.halls)
            hallnumbers.add(h.hallNumber);
        
        return hallnumbers;
    }
    
    public static void addHall(int CinemaIndex, Hall h){
        Cinema c = cinemas.get(CinemaIndex);
        h.hallNumber=++c.Hallcount;
        c.halls.add(h);
    }
    
    public static Hall getHall(int cinema, int hall){
        Cinema c = cinemas.get(cinema);
        return c.halls.get(hall);
    }
    
    public static void RemoveHall(int CinemaIndex, int hallindex){
        Cinema c = cinemas.get(CinemaIndex);
        
        c.halls.remove(hallindex);
    }
       public static ArrayList<String> getMovieNamesList(int cinemaIndex){
        ArrayList<String> MovieNames = new ArrayList<>();
        Cinema c = cinemas.get(cinemaIndex);
        for(Hall h: c.halls)
            MovieNames.add(h.getMovieNameForList());
        return MovieNames;
    }
       public static int getHallCount (int CinemaIndex) {
           Cinema c = cinemas.get(CinemaIndex);
           return c.Hallcount ;
       }
       public static void initSeats (int NuSeats,int Cinemaindex,int Hallindex ){
           
        Cinema c = cinemas.get(Cinemaindex);
        Hall h = c.getHall(Cinemaindex,Hallindex );
        h.SeatList.clear();
        h.seatNumbers = NuSeats;
       for(int i=1;i<=h.seatNumbers;i++)
       { Seat s = new Seat(i); 
         h.SeatList.add(s);
       }
       
       }
       public static String reserveSeat(int CinemaIndex ,String Movie ,int Seatno )
       {
           Cinema c = cinemas.get(CinemaIndex);
           for(Hall h : c.halls)
           {
               if(Movie.equalsIgnoreCase(h.getMovieName()))
               { for(Seat s : h.SeatList)
                   { if(Seatno == s.SeatNo)
                       if (s.Free)
                       { s.reserve();
                         return "r";
                       }
                       else 
                        return "nr" ;
                    }
                 }   
            }
                return "ne"; 
       }
        public static String CancelSeat(int CinemaIndex ,String Movie ,int Seatno )
       {
           Cinema c = cinemas.get(CinemaIndex);
           for(Hall h : c.halls)
           {
               if(Movie.equalsIgnoreCase(h.getMovieName()))
               { for(Seat s : h.SeatList)
                   { if(Seatno == s.SeatNo)
                       if (s.Free == false)
                       { s.cancel();
                         return "c";
                       }
                       else 
                        return "nc" ;
                    }
                 }   
            }
                return "ne"; 
       }
}
