/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1q5;
import java.io.*;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class HW1Q5 {

    
    public static void main(String[] args) throws IOException {
        double A1,A2,B1,B2,C1,C2;
        double AB,AC,BC;
        String next = "";
        FileWriter file = new FileWriter("HW1Q5.txt");
        BufferedWriter write = new BufferedWriter(file);
        Scanner input = new Scanner(System.in);
        while(!next.equals("No")){
            System.out.println("Enter three 2D points: ");
        A1 = input.nextDouble();
        A2 = input.nextDouble();
        B1 = input.nextDouble();
        B2 = input.nextDouble();
        C1 = input.nextDouble();
        C2 = input.nextDouble();
        AB = CalculateSides(A1,A2,B1,B2);
        write.write("The side for AB is:" + AB +"\n");
        AC = CalculateSides(C1,C2,A1,A2);
        write.write("The side for AB is:" + AC + "\n");
        BC = CalculateSides(B1,B2,C1,C2);
        write.write("The side for AB is:" + BC + "\n");
         if(AB + AC > BC)
        {
            System.out.println("real");
            write.write("Real\n");
            }
        else if(AB + BC > AC)
        { 
            System.out.println("real\n");
            write.write("Real\n");
        }else if(BC + AC > AB)
        {
            System.out.println("real\n");
            write.write("Real\n");
        }
        else{
            System.out.println("not real");
            write.write("Not real\n");
        }
        System.out.println("Do you want to continue? (Press any letter to continue,type in 'No' to quit.");
        next = input.next();
        }write.close();
    }
    public static double CalculateSides(double x1,double x2,double y1, double y2){
        double side;
        side = sqrt(pow((x2-x1),2)+pow((y2-y1),2));
        System.out.println(side);
        return side;
    }
    
}
