/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachmonhoc;
import java.io.*;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<MonHoc> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            MonHoc a = new MonHoc(in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()));
            list.add(a);
        }
        Collections.sort(list);
        for(MonHoc i : list){
            System.out.println(i);
        }
    }
}
