/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachkhachhangtrongfile;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
class KhachHang implements Comparable<KhachHang>{
    private String name,sex,ad,code,name1;
    private Date sn;

    public KhachHang(int n,String name, String sex, String sn, String ad) throws ParseException {
        this.code = String.format("KH%03d", n);
        this.name = name;
        this.sex = sex;
        this.ad = ad;
        this.sn = new SimpleDateFormat("dd/MM/yyyy").parse(sn);
    }
    
    private void solvename(){
        String s0 = name.trim().toLowerCase();
        String[] s = s0.split("\\s+");
        String s1 = "";
        for(int i=0;i<s.length;i++){
            s1 += s[i].substring(0, 1).toUpperCase();
            s1 += s[i].substring(1);
            s1 += " ";
        }
        name1 = s1;
    }
    
    @Override
    public String toString(){
        solvename();
        return code + " " + name1 + " " + sex + " " + ad + " " + new SimpleDateFormat("dd/MM/yyyy").format(sn);
    }
    
    @Override
    public int compareTo(KhachHang a){
        return sn.compareTo(a.sn);
    }
}
