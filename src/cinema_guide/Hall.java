package cinema_guide;

import java.util.ArrayList;

/**
 *
 * @author Amr
 */
 class Hall {

    
    public int hallNumber;
    public int seatNumbers;
    private Movie m ;
    public ArrayList<Seat> SeatList = new ArrayList<Seat>() ;
    
    public Hall() {
        this.hallNumber = 0;
        this.seatNumbers = 0;
        this.m = null;
    }
    public Hall(int a , int b , Movie m ) {
        this.hallNumber = a;
        this.seatNumbers = b;
        this.m = m;
    }

    public void setM(Movie m) {
        this.m = m;
    }
    
    public void removeMovie(){
        this.m = null;
    }
    
    public String getMovieName(){
        if(this.m == null)
            return "No Movie";
        return m.getName();
    }
      public String getMovieNameForList(){
        if(this.m == null)
            return "------";
        return m.getName();
    }
//      public void setseatNumbers(int i){
//          this.seatNumbers = i ;
//      }
     
      
       
   
}
