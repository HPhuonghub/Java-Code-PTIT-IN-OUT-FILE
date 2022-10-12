/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachluutru;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
class Khach implements Comparable<Khach>{
    private String maK,ten,maP;
    private Date den,di;
    private long ngay;

    public Khach(int n, String ten, String maP, String den,String di) throws ParseException {
        this.maK = "KH" + String.format("%02d", n);
        this.ten = ten;
        this.maP = maP;
        this.den = new SimpleDateFormat("dd/MM/yyyy").parse(den);
        this.di = new SimpleDateFormat("dd/MM/yyyy").parse(di);
    }
    
    private void solve(){
        if(den.compareTo(di)==0) ngay = 0;
        else{
            ngay = (di.getTime() - den.getTime())/24/3600/1000;
        }
    }
    
    @Override
    public String toString(){
        solve();
        return maK + " " + ten + " " + maP + " " + ngay;
    }
    
    @Override
    public int compareTo(Khach a){
        solve();
        a.solve();
        if(ngay > a.ngay) return -1;
        if(ngay < a.ngay) return 1;
        return 0;
    }
}
