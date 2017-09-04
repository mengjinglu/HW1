/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1q3;
import java.io.*;

/**
 *
 * @author mengjinglu
 */
public class HW1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int num = (int)(Math.random() * 13 + 1);//I got this idea from StackOverflow
        System.out.println(num);
        FileWriter file = new FileWriter("HW1Q3.txt");
        BufferedWriter write = new BufferedWriter(file);
        switch(num){
            case 1:write.write("January");
            break;
            case 2:write.write("Feburary");
            break;
            case 3:write.write("March");
            break;
            case 4:write.write("April");
            break;
            case 5:write.write("May");
            break;
            case 6:write.write("June");
            break;
            case 7:write.write("July");
            break;
            case 8:write.write("August");
            break;
            case 9:write.write("September");
            break;
            case 10:write.write("October");
            break;
            case 11:write.write("November");
            break;
            case 12:write.write("December");
            
        }
        write.close();
    }
    
}
