/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the operation
 *
 * @author sivagamasrinivasan
 * date 06/20
 */
public class ArithmeticBase 
{
 public double x=1;
 public double y=2;
 
    double calculate(double x, double y) 
        {
        Scanner sc =new Scanner(System.in);
       // System.out.println("enter S");
       // String s= sc.next();
        //System.out.println("enter numbers");
      //  double num = sc.nextDouble();
 
        double PLUS =x +y;
        System.out.println("PLUS "+ PLUS);
        
        double MINUS =x -y;
        System.out.println("MINUS "+ MINUS);
        
         double TIMES =x *y;
        System.out.println("TIMES "+ TIMES);
        
         double DIVIDE =x /y;
        System.out.println("DIVIDE "+ DIVIDE);
        return PLUS;
        
        
    }

}
