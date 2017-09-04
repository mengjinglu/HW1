/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1q6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;


public class HW1Q6 {
    public static void main(String[] args) throws IOException {
        double x1,x2,y1,y2,r1,r2,distance;
        Scanner input = new Scanner(System.in);
        String next = "";
        FileWriter file = new FileWriter("HW1Q6.txt");
        BufferedWriter write = new BufferedWriter(file);
        while(!next.equals("No")){
            System.out.println("Please enter first center");
        x1 = input.nextDouble();
        x2 = input.nextDouble();
        System.out.println("Please enter second center");
        y1 = input.nextDouble();
        y2 = input.nextDouble();
        System.out.println("Please enter first radius");
        r1 = input.nextDouble();
        System.out.println("Please enter second radius");
        r2 = input.nextDouble();
        distance = sqrt(pow((x2-x1),2)+pow((y2-y1),2));
        System.out.println("The distance of two center point is: " + distance);
            
             if(distance > (r1+r2)){
                System.out.println("These two circles are seperate from each other");
                write.write("The distance between two center is: "+ Double.toString(distance)+"\n");
                write.write("The sum of radius is:" + Double.toString((r2+r1))+"\n");
                write.write("These two circles are seperate from each other");
            }if(distance < (r1+r2) && distance < r1){
                System.out.println("The second circle is in first circle");
                write.write("The distance between two center is: "+ Double.toString(distance)+"\n");
                write.write("The sum of radius is:" + Double.toString((r2+r1))+"\n");
                write.write("The second circle is inside the first one ");
                
            }if(distance < (r1+r2) && distance < r2){
                System.out.println("The first circle is in the second circle");
                write.write("The distance between two center is: "+ Double.toString(distance)+"\n");
                write.write("The sum of radius is:" + Double.toString((r2+r1))+"\n");
                write.write("The first circle is inside the second circle ");
                
            }
            if(distance < (r1+r2)){
                System.out.println("These two circles are overlapping each other");
                write.write("The distance between two center is: "+ Double.toString(distance)+"\n");
                write.write("The sum of radius is:" + Double.toString((r2+r1))+"\n");
                write.write("These two circles are overlapping each other\n");
            }
            if(distance == (r1+r2)){
                System.out.println("These two circles are touching each other");
                write.write("The distance between two center is: "+ Double.toString(distance)+"\n");
                write.write("The sum of radius is:" + Double.toString((r2+r1))+"\n");
                write.write("These two ciecles are touching each other");
            }
            
            System.out.println("Do you want to test another two circles?");
            next = input.next();
            

             
        }write.close();
    }
    }

