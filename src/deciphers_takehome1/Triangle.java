
package deciphers_takehome1;

/**
 *
 * @author regaladojanine
 */
public class Triangle extends Polygon{
    private double b;
    private double h;
    
    Triangle(){
        
        b= 13;
        h=4;
    }
    
    Triangle(double height, double base){
        
        this.b = base;
        this.h = height;
        
}
         
public double getBase(){   
    return b;
}
public double getHeight(){   
    return h;
}
    
}
