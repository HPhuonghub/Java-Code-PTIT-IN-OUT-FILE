package danhsachsinhvientrongfile2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.IOException;
import java.util.*;
import java.text.*;
/**
 *
 * @author DELL
 */
public class SinhVien {
    private String ten,lop,ma;
    private Date sn;
    private float diem;

    public SinhVien(int n, String ten, String lop, String sn, float diem) throws ParseException, IOException{
        this.ma = "B20DCCN0" + String.format("%02d", n);
        this.ten = ten;
        this.lop = lop;
        this.sn =  new SimpleDateFormat("dd/MM/yyyy").parse(sn);
        this.diem = diem;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(sn) + " " + String.format("%.2f", diem);
    }
}
