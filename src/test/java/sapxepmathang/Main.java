/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepmathang;
import java.util.*;
import java.io.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<MatHang> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            MatHang a = new MatHang(i,in.nextLine(),in.nextLine(),Double.parseDouble(in.nextLine()),Double.parseDouble(in.nextLine()));
            list.add(a);
        }
        Collections.sort(list);
        for(MatHang i : list){
            System.out.println(i);
        }
    }
}
