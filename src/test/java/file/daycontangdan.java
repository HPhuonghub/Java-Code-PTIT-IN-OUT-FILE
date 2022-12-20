/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;
import java.io.*;
import java.util.*;
/**
 *
 * @author DELL
 */
public class daycontangdan {
    public static int n, a[] = new int[25],ok;
    public static void kt(){
        for(int i=1;i<=n;i++){
            a[i] = 0;
        }
    }
    public static void sinh(){
        int i = n;
        while(i >= 1 && a[i] == 1){
            a[i] = 0;
            --i;
        }
        if(i==0){
            ok=0;
        }
        else a[i] = 1;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DAYSO.in"));
        n = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0;i<n;i++){
            b.add(in.nextInt());
        }
        ok = 1;
        kt();
        while(ok==1){
            String s = "";
            boolean check = true;
            ArrayList<Integer> c = new ArrayList<>();
            for(int i =1;i<=n;i++){
                if(a[i]==1){
                    c.add(b.get(i-1));
                }
            }
            for(int i=0;i<c.size()-1;i++){
                for(int j=i+1;j<c.size();j++){
                    if(Integer.compare(c.get(i), c.get(j))==1) check = false;
                }
            }
            if(c.size()>1 && check==true){
                for(Integer i : c){
                    s += Integer.toString(i) + " ";
                }
                list.add(s);
            }
            sinh();
        }
        Collections.sort(list);
        for(String i : list){
            System.out.println(i);
        }
    }
    
}
