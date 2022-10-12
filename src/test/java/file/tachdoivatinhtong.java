/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;
import java.util.*;
import java.io.*;
import java.math.*;
/**
 *
 * @author DELL
 */
public class tachdoivatinhtong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        BigInteger n = in.nextBigInteger();
        String s = n.toString();
        while(true){
            if(s.length()==1) break;
            String s1 = s.substring(0, s.length()/2);
            String s2 = s.substring(s.length()/2);
            BigInteger n1 = new BigInteger(s1);
            BigInteger n2 = new BigInteger(s2);
            BigInteger sum = n1.add(n2);
            System.out.println(sum);
            s = sum.toString();
        }
    }
}
