
 
package cinema_guide;


public class Seat {
    public int SeatNo;
    public boolean Free ;

    public Seat(int SeatNo) {
        this.SeatNo = SeatNo;
        this.Free = true ;
    }
    public void reserve(){
        this.Free = false ;
   }
    public void cancel(){
        this.Free=true;
    }
    
}
