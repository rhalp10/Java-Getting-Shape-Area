
package deciphers_takehome1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author regaladojanine
 */
public class Deciphers_takehome1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##"); //decimal places
        double a;
        int choice,r;
        char answer;
        
    do{
            System.out.print("Choose the shape you want to perform:");
            System.out.println();
            System.out.println("[1] Area of Circle ");
            System.out.println("[2] Area of Square ");
            System.out.println("[3] Area of Triangle ");
            System.out.println("[4] Area of Rectangle ");
            System.out.println("[5] Exit \n");
            
                
            System.out.print ("Enter desired option: ");
            choice = in.nextInt();
            
            
            
            if (choice == 1){//it will excute if the user choose circle to perform
                
                    System.out.print("Do you want to customize shape? [Y/N] : ");
                    answer = in.next().charAt(0);
                    
                     if(answer=='y' || answer=='Y'){       
        
                            int ns=0;//number of sides
                            System.out.println("Enter the value of radius: ");
                            double rad = in.nextDouble();
                            
                            Circle c = new Circle(rad);//
                            //System.out.println(c.getArea(ns, c.getV()));//pass value to getvalue method in polygon
                            System.out.println("The area of circle is "+df.format(c.getArea(ns, c.getRadius())));
                            System.out.println();
                            
                                                    }
                     else {
                              int ns=0;
                              Circle c = new Circle();
                              c.getArea(ns,(double) c.getRadius());
                              System.out.println("The area of circle is "+df.format(c.getArea(ns, c.getRadius())));
                              System.out.println();
                            }
                            }   
            
            else if (choice == 2){//it will excute if the user choose square to perform
                
                    System.out.print("Do you want to customize shape? [Y/N] : ");
                    answer = in.next().charAt(0);
                 
                    if(answer=='y' || answer=='Y'){            
                             System.out.println("Enter the value of side: ");
                             double side = in.nextDouble();
                             
                             int ns = 4;
                             Square s = new Square(side);
                             s.getArea(ns, s.getSide());
                             System.out.println("The area of square is "+df.format(s.getArea(ns, s.getSide())));
                             System.out.println();   
                                                 } 
                    else {                        
                              int ns=4;
                              Square s = new Square();
                              s.getArea(ns,(double) s.getSide());
                              System.out.println("The area of square is "+df.format(s.getArea(ns, s.getSide())));
                              System.out.println();                              
                           }
                            }
            
            else if (choice == 3){
                   
                    System.out.print("Do you want to customize shape? [Y/N] : ");
                    answer = in.next().charAt(0);
                   
                    if(answer=='y' || answer=='Y'){       
                    
                             System.out.println("Enter the value of Height: ");
                             double h = in.nextDouble();
                             System.out.println("Enter the value of Base: ");
                             double b = in.nextDouble();
                            
                             int ns = 3;
                             Triangle tri = new Triangle(h,b);
                             tri.getArea(ns,tri.getHeight(),tri.getBase());
                             System.out.println("The area of triangle is "+df.format(tri.getArea(ns,tri.getHeight(),tri.getBase())));
                             System.out.println();       
                                                 }
                    else {
                              int ns=3;
                              Triangle tri = new Triangle();
                              tri.getArea(ns,(double) tri.getHeight(),(double) tri.getBase());
                              System.out.println("the area of triangle is "+df.format(tri.getArea(ns,tri.getHeight(),tri.getBase())));
                              System.out.println(); 
                            }
                                }
            
            else if (choice == 4){
                      
                    System.out.print("Do you want to customize shape? [Y/N] : ");
                    answer = in.next().charAt(0);
                    
                     if(answer=='y' || answer=='Y'){       
                         
                             System.out.println("Enter the value of length: ");
                             double l = in.nextDouble();
                             System.out.println("Enter the value of width: ");
                             double w = in.nextDouble();
                    
                             int ns = 4;
                             Rectangle rec = new Rectangle(l,w);
                             rec.getArea(ns,rec.getLength(),rec.getWidth());
                             System.out.println("The area of rectangle is "+df.format(rec.getArea(ns,rec.getLength(),rec.getWidth())));
                             System.out.println(); 
                                                    }
                     else {
                              int ns=4;
                              Rectangle rec = new Rectangle();
                              rec.getArea(ns,(int) rec.getLength(),(int) rec.getWidth());
                              System.out.println("The area of rectangle is "+df.format(rec.getArea(ns,rec.getLength(),rec.getWidth())));
                              System.out.println();  
                                }
                                }
            else if (choice == 5){
                    System.exit(0);
                                }
            else 
                {   
                    System.out.println("Invalid Input! Please try again!\n");
                }
        }
    
    while (choice != 5);

// TODO code application logic here
    }
       
    
}
