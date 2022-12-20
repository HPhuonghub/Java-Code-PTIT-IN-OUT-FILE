/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsanpham_2;

/**
 *
 * @author DELL
 */
class SanPham implements Comparable<SanPham>{
    private String code,name;
    private int price,time;

    public SanPham(String code, String name, int price, int time) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.time = time;
    }
    
    @Override
    public String toString(){
        return code + " " + name + " " + price + " " + time;
    }
    
    @Override
    public int compareTo(SanPham a){
        if(price==a.price){
            return code.compareTo(a.code);
        }
        else if(price<a.price) return 1;
        else return -1;
    }
}
