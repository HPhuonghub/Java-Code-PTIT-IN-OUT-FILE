/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsanpham_2;
import java.util.*;
import java.io.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SanPham> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            SanPham a = new SanPham(in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
            list.add(a);
        }
        Collections.sort(list);
        for(SanPham i : list){
            System.out.println(i);
        }
    }
}
