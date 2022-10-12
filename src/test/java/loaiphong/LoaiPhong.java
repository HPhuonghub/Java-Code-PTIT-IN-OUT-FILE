/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loaiphong;

/**
 *
 * @author DELL
 */
class LoaiPhong implements Comparable<LoaiPhong>{
    private String phong,kh,ten;
    private int gia;
    private float phi;

    public LoaiPhong(String phong) {
        this.phong = phong;
    }
    
    private void solve(){
        String[] s = phong.split("\\s+");
        kh = s[0];
        ten = s[1];
        gia = Integer.parseInt(s[2]);
        phi = Float.parseFloat(s[3]);
    }
    
    @Override
    public String toString(){
        solve();
        return kh + " " + ten + " " + gia + " " + String.format("%.2f", phi);
    }
    
    @Override
    public int compareTo(LoaiPhong a){
        solve();
        a.solve();
        if(ten.compareTo(a.ten)>0) return 1;
        if(ten.compareTo(a.ten)<0) return -1;
        return 0;
    }
}
