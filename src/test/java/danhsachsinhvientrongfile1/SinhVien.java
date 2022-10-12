/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsinhvientrongfile1;

/**
 *
 * @author DELL
 */
class SinhVien implements Comparable<SinhVien>{
    private String ma,ten,lop,email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    
    private void ChuanHoa(){
        String s = ten.trim().toLowerCase();
        String[] s1 = s.split("\\s+");
        String s2 = "";
        for (int i = 0; i < s1.length; i++) {
            s2 += s1[i].substring(0, 1).toUpperCase();
            s2 += s1[i].substring(1) + " ";
        }
        ten = s2;
    }
    
    @Override
    public String toString(){
        ChuanHoa();
        return ma + " " + ten + lop + " " + email;
    }
    
    @Override
    public int compareTo(SinhVien a){
        if(ma.compareTo(a.ma)<0) return -1;
        if(ma.compareTo(a.ma)>0) return 1;
        return 0;
    }
}
