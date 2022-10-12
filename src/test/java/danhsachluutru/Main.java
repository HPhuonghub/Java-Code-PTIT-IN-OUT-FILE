/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachluutru;
import java.io.*;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner in = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<Khach> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            Khach a = new Khach(i,in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            list.add(a);
        }
        Collections.sort(list);
        for(Khach i : list){
            System.out.println(i);
        }
    }
}
