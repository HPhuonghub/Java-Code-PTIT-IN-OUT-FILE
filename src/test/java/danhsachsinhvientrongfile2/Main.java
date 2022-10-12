package danhsachsinhvientrongfile2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import java.text.*;
import java.io.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws ParseException, IOException{
        Scanner in = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            SinhVien a = new SinhVien(i,in.nextLine(),in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()));
            list.add(a);
        }
        for(SinhVien i : list){
            System.out.println(i);
        }
    }
}
