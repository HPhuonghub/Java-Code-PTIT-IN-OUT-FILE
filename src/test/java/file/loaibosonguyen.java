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
public class loaibosonguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<String> list = new ArrayList<>();
        while(in.hasNext()){
            String s = in.next();
            try{
                Integer.parseInt(s);
            } catch (Exception x){
                list.add(s);
            }
        }
        Collections.sort(list);
        for(String i : list){
            System.out.print(i + " ");
        }
    }
}
