
package deciphers_takehome1;

/**
 *
 * @author regaladojanine
 */
public class Square extends Polygon {
    
    private double side;
    Square(){
        
        side = 3;
        
    }
    Square(double sides){
        
        this.side = sides;
        
    }
      
public double getSide(){   
    return side;
}
}
