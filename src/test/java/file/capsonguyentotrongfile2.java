/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.io.*;
import java.util.*;

/**
 *
 * @author DELL
 */
public class capsonguyentotrongfile2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) in2.readObject();
        int count1[] = new int[1000001];
        int count2[] = new int[1000001];
        for(Integer i : list1){
            if(nt(i)) count1[i]++;
        }
        for(Integer i : list2){
            if(nt(i)) count2[i]++;
        }
        for(int i=0;i<1000000;i++){
            int m = 1000000 - i;
            if(count1[i] > 0 && count1[m] > 0 && count2[i] == 0 && count2[m] == 0 && m > i){
                System.out.println(i + " " +  m);
            }
        }
    }
    
    private static boolean nt(Integer n){
        if(n<2) return false;
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
            return true;
        }
    }
}
