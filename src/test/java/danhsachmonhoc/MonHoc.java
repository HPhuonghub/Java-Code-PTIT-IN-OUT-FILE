/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachmonhoc;

/**
 *
 * @author DELL
 */
class MonHoc implements Comparable<MonHoc>{
    private String ma,ten;
    private int tc;

    public MonHoc(String ma, String ten, int tc) {
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + tc;
    }
    
    @Override
    public int compareTo(MonHoc a){
        if(ten.compareTo(a.ten)>0) return 1;
        if(ten.compareTo(a.ten)<0) return -1;
        return 0;
    }
}
