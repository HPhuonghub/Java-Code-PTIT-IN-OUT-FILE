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
public class songuyentolonnhattrongfile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) sc.readObject();
        int a[] = new int[100001];
        for(Integer i : list){
            if(nt(i)){
                a[i]++;
            }
        }
        int dem = 0;
        for(int i=1000000;i>=2;i--){
            if(a[i]>0){
                System.out.println(i + " " + a[i]);
                dem++;
                if(dem==10) break;
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
