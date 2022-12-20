/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lietkecapso_1;
import java.io.*;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> list = (ArrayList<Pair>) sc.readObject();
        Collections.sort(list);
        int t = 0;
        while(t<list.size()-1){
            if(list.get(t).getFirst() == list.get(t+1).getFirst() && list.get(t).getSecond() == list.get(t+1).getSecond()){
                list.remove(t);
            }
            else{
                t++;
            }
        }
        for(Pair i : list){
            if(i.getFirst() < i.getSecond()){
                System.out.println(i);
            }
        }
    }
}
