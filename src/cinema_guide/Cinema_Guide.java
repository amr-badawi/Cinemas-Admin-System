/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema_guide;

/**
 *
 * @author Amr
 */
public class Cinema_Guide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cinema a = new Cinema("CityStars", "Nasr City", 75);
        Cinema b = new Cinema("CFC", "Tagamoa", 75);
        Cinema c = new Cinema("SunCity", "Sheraton", 50);
        
       AddHallCtrl.addHall(0);
       AddHallCtrl.addHall(0);
       AddHallCtrl.addHall(0);
       AddHallCtrl.addHall(0);
       AddHallCtrl.addHall(0);
        
       AddHallCtrl.addHall(1);
       AddHallCtrl.addHall(1);
       AddHallCtrl.addHall(1);
       
       AddHallCtrl.addHall(2);
       AddHallCtrl.addHall(2);
       AddHallCtrl.addHall(2);
       
       ModifyHallCtrl.initSeats(100, 0, 0);
       ModifyHallCtrl.initSeats(100, 0, 1);
       ModifyHallCtrl.initSeats(100, 0, 2);
       ModifyHallCtrl.initSeats(100, 0, 3);
       ModifyHallCtrl.initSeats(100, 0, 4);
       
       ModifyHallCtrl.initSeats(100, 1, 0);
       ModifyHallCtrl.initSeats(100, 1, 1);
       ModifyHallCtrl.initSeats(100, 1, 2);
       
       ModifyHallCtrl.initSeats(100, 2, 0);
       ModifyHallCtrl.initSeats(100, 2, 1);
       ModifyHallCtrl.initSeats(100, 2, 2);
    
       AddMovieCtrl.addMovie(0, 0, "Avengers", 2018);
       AddMovieCtrl.addMovie(0, 1, "Venom", 2018);
       AddMovieCtrl.addMovie(0, 2, "Spiderman", 2018);
       AddMovieCtrl.addMovie(0, 4, "Inception", 2010);
       
       AddMovieCtrl.addMovie(1, 0, "Mission Impossible", 2018);
       AddMovieCtrl.addMovie(1, 1, "The Purge", 2016);
       
       AddMovieCtrl.addMovie(2, 0, "Split", 2017);
       AddMovieCtrl.addMovie(2, 1, "The Amazing Spiderman", 2017);
       AddMovieCtrl.addMovie(2, 1, "The Fault in Our Stars", 2014);
       
      
        HomePage h = new HomePage();
        h.setVisible(true);
    }
    
}
