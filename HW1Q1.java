/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1q1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class HW1Q1 {

    
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("HW1Q1.txt");
        BufferedWriter write = new BufferedWriter(file);
        write.write("I read, understood and agree to Brooklyn College academic integrity guideline.");
        write.close();
    }
    
}
