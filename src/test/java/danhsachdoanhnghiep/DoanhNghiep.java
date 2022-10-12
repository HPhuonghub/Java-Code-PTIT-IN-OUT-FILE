/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachdoanhnghiep;

/**
 *
 * @author DELL
 */
class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma,ten;
    private int nhan;
    
    public DoanhNghiep(String ma, String ten, int nhan){
        this.ma = ma;
        this.ten = ten;
        this.nhan = nhan;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + nhan;
    }
    
    @Override
    public int compareTo(DoanhNghiep a) {

        if (ma.compareTo(a.ma) > 0) {
            return 1;
        }
        if (ma.compareTo(a.ma) < 0) {
            return -1;
        }
        return 0;

    }
}
