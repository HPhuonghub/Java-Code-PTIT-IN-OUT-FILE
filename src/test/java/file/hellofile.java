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
public class hellofile {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("Hello.txt"));
        while(in.hasNextLine()){
            System.out.println(in.nextLine());
        }
    }
}
