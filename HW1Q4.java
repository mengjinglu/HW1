/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1q4;

import java.io.*;

public class HW1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader file = new FileReader("HW1Q4.txt");
        BufferedReader read = new BufferedReader(file);
        String myStr;
        while((myStr = read.readLine())!= null){
            System.out.println(myStr);
        }
    }
    
}
