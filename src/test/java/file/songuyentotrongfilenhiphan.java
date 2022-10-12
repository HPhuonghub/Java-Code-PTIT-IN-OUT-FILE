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
public class songuyentotrongfilenhiphan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) sc.readObject();
        int a[] = new int[100000];
        for(Integer i : list){
            if(nt(i)){
                a[i]++;
            }
        }
        for(int i=0;i<10000;i++){
            if(a[i]>0){
                System.out.println(i + " " + a[i]);
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
