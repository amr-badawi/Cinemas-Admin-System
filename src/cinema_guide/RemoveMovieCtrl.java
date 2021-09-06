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
public class RemoveMovieCtrl {
    public static ArrayList<String> getCinemasNames(){
        return Cinema.getCinemasNames();
    }
    public static ArrayList<Integer> getHallnumbersofCinema(int index){
        return Cinema.getHallnumbersofCinema(index);
    }
    
    public static void removeMovie(int cinema, int hall){
        Hall h = Cinema.getHall(cinema, hall);
        h.removeMovie();
    }
    
    public static String getMovieName(int cinema, int hall){
        Hall h = Cinema.getHall(cinema, hall);
        return h.getMovieName();
    }
    
  
}
