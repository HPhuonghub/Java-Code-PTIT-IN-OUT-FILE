/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Files;
import java.util.*;
import java.io.*;
/**
 *
 * @author DELL
 */
public class Sokhacnhautrongfile1 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("DATA.in"));
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        while(in.hasNext()){
            int s = in.nextInt();
            arr.add(s);
        }
        for (Integer a : arr) {
            if (map.containsKey(a)) {
                Integer value = map.get(a);
                value++;
                map.replace(a, value);
            } else {
                map.put(a,1);
            }
        }

        for (Integer i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }
    }
}
