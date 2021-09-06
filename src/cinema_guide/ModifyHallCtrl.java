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
public class ModifyHallCtrl {
     public static ArrayList<String> getCinemasNames(){
        return Cinema.getCinemasNames();
    }
    public static ArrayList<Integer> getHallnumbersofCinema(int index){
        return Cinema.getHallnumbersofCinema(index);
    }
    public static void initSeats (int NuSeats,int CinemaIndex,int Hallindex){
       Cinema.initSeats(NuSeats, CinemaIndex,Hallindex);
    }
    public static int getHallCount (int CinemaIndex) {
        return Cinema.getHallCount(CinemaIndex);
    }
    
}
