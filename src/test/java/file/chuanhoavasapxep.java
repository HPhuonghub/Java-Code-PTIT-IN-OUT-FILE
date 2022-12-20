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
public class chuanhoavasapxep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DANHSACH.in"));
        ArrayList<String> list = new ArrayList<>();
        while(in.hasNextLine()){
            String s = in.nextLine();
            String s1 = s.trim().toLowerCase();
            String[] s2 = s1.split("\\s+");
            String s3 = "";
            for(int i=0;i<s2.length-1;i++){
                s3 += s2[i].substring(0, 1).toUpperCase() + s2[i].substring(1) + " ";
            }
            s3 += s2[s2.length-1].substring(0, 1).toUpperCase() + s2[s2.length-1].substring(1);
            list.add(s3);
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String ten1 = o1.substring(o1.lastIndexOf(" ") + 1);
                String ten2 = o2.substring(o2.lastIndexOf(" ") + 1);
                String ho1 = o1.substring(0, o1.lastIndexOf(" "));
                String ho2 = o2.substring(0, o2.lastIndexOf(" "));
                if (ten1.compareTo(ten2) == 0) {
                    return ho1.compareTo(ho2);
                }
                return ten1.compareTo(ten2);
            }
        });
        for(String s : list){
            System.out.println(s);
        }
    }
}
