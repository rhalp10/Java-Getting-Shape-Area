
package deciphers_takehome1;

/**
 *
 * @author regaladojanine
 */
public class Rectangle extends Polygon{
    
    private double l;
    private double w;
    
    Rectangle(){
        
        l=10;
        w=6;
        
    }
    Rectangle(double length,double width){
        
        this.l = length;
        this.w = width;
        
    }
    public double getLength(){   
    return l;
}
    public double getWidth(){   
    return w;
}
    
}
