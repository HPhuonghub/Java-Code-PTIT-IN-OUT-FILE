/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;
import java.util.*;
import java.io.*;
/**
 *
 * @author DELL
 */
public class sokhacnhautrongfile3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
            ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<Integer> list = (ArrayList<Integer>) sc.readObject();
            int a[] = new int[1000001];
            for(Integer i : list) a[i]++;
            for(int i=0;i<1000;i++){
                if(a[i]>0){
                    System.out.println(i + " " + a[i]);
                }
            }
    }    
}
