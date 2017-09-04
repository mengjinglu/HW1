/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;
import java.io.*;
import java.util.*;

/**
 *
 * @author mengjinglu
 */
public class HW1 {
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    final double x = Math.PI;
    double area;
    Scanner input = new Scanner(System.in);
    String r = input.nextLine();
    String myStr = "^d";
    FileWriter file = new FileWriter("HW1Question2.txt");
    BufferedWriter write = new BufferedWriter(file);
    while( !r.equals(myStr)){
        area = x * Math.pow(Double.parseDouble(r), 2);
        System.out.println(area);
        write.write(Double.toString(area)+"\n");
        r = input.nextLine();
    }
        write.close();
    
}
    }
    

