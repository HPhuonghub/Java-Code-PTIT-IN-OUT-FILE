/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lietkecapso_2;
import java.util.*;
import java.io.*;
/**
 *
 * @author DELL
 */
public class Main {
    public static int GCD(int a, int b) {

        if (b == 0) {
            return a;
        }

        return GCD(b, a % b);

    }
    
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
            if(i.getFirst() < i.getSecond() && GCD(i.getFirst(),i.getSecond())==1){
                System.out.println(i);
            }
        }
    }
    
    
}
