/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTienPhong;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
class KhachHang implements Comparable<KhachHang>{
    private String id,name;
    private int idroom,serviceaddmoney;
    private Date check_in_date,check_out_date;

    public KhachHang(int n, String name, int idroom, int serviceaddmoney, String check_in_date, String check_out_date) throws ParseException {
        this.id = String.format("KH%2d", n);
        this.name = name;
        this.idroom = idroom;
        this.check_in_date = new SimpleDateFormat("dd/MM/yyyy").parse(check_in_date);
        this.check_out_date = new SimpleDateFormat("dd/MM/yyyy").parse(check_out_date);
        this.serviceaddmoney = serviceaddmoney;
    }
    
    public String toString(){
        
    }
}
