/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Files;
import java.util.*;
import java.io.*;
/**
 *
 * @author DELL
 */
public class tinhtong {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(in.hasNext()){
            String s = in.next();
            try{
                sum = sum + Integer.parseInt(s);
            }catch(NumberFormatException e){
                continue;
            }
        }
        System.out.println(sum);
    }
}
