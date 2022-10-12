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
public class chuanhoaxauhotentronfile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<String> list = new ArrayList<>();
        while(true){
            String s = in.nextLine();
            if(s.equals("END")) break;
            s = s.trim().toLowerCase();
            String[] s1 = s.split("\\s+");
            String s2 = "";
            for(int i=0;i<s1.length;i++){
                s2 += s1[i].substring(0,1).toUpperCase();
                s2 += s1[i].substring(1) + " ";
            }
            list.add(s2);
        }
        for(String i : list){
            System.out.println(i);
        }
    }
}
