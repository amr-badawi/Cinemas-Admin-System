/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema_guide;

import java.util.ArrayList;

/**
 *
 * @author Amr
 */
public class ReserveSeatCtrl {
    public static ArrayList<String> getCinemasNames(){
        return Cinema.getCinemasNames();
    }
    
   public static ArrayList<String> getMovieNameList(int CinemaIndex){
       return Cinema.getMovieNamesList(CinemaIndex);
       
   }
   public static String reserveSeat(int CinemaIndex ,String Movie ,int Seatno )
   {
       return Cinema.reserveSeat(CinemaIndex, Movie, Seatno);
   }
}
