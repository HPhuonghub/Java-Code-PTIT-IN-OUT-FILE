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
public class sothuannghichtrongfile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) in2.readObject();
        int count1[] = new int[1000001];
        int count2[] = new int[1000001];
        for(Integer i : list1) count1[i]++;
        for(Integer i : list2) count2[i]++;
        int dem = 0;
        for(int i=0;i<=1000000;i++){
            if(count1[i] > 0 && count2[i] > 0 && tn(i)){
                int m = count1[i] + count2[i];
                System.out.println(i + " " + m);
                dem++;
                if(dem==10) break;
            }
        }
    }
    
    private static boolean tn(int n){
        String s=String.format("%d", n);
        String dao = "";
        for (int i=0;i<s.length();i++){
            dao=s.charAt(i)+dao;
        }
        if (!dao.equals(s)) return false;
        if(s.length()%2==0 || s.length()<=1) return false;
        for(int i=0;i<s.length();i++){
            if(Integer.parseInt(s.substring(i, i+1))%2==0) return false;
        }
        return true;
    }
}
