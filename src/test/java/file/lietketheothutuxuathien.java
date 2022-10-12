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
public class lietketheothutuxuathien {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> list = (ArrayList<String>) sc.readObject();
        TreeSet<String> set = new TreeSet<>();
        for(String i : list){
            String[] s = i.trim().toLowerCase().split("\\s+");
            set.addAll(Arrays.asList(s));
        }
        Scanner in = new Scanner(new File("VANBAN.in"));
        while(in.hasNext()){
            String s = in.next().toLowerCase();
            if(set.contains(s)){
                System.out.println(s);
                set.remove(s);
            }
        }
    }
}
