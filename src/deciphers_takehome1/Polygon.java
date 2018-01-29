
package deciphers_takehome1;

import java.util.Scanner;
import javafx.scene.shape.Circle;
/**
 *
 * @author regaladojanine
 */
public class Polygon {
      Scanner out = new Scanner(System.in);
      private double p = 3.14;
      private double a;//cuztomize value
      private double t = .5;//1/2 of triangle formula
      private int ns;//number of sides

      //--------------------------getarea----------------------------
      
   
      public double getArea(int ns,double me) {
        
             
            if(ns==0){                 
                        a = p*me*me;
                     }
            else{
                    a =  me*me;
                 }

            return a;
                                             }
    
     public double getArea(int ns,double lh,double bw) {
        
          
           if(ns==4){
                      a = lh*bw;
                    }
            else{
                    a = lh*bw*t;
              
                }
            return a;
                                                        }
}
