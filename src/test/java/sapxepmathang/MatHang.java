/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepmathang;
import java.math.*;
/**
 *
 * @author DELL
 */
class MatHang implements Comparable<MatHang>{
    private String code,name,type;
    private double buy,sell,profit;

    public MatHang(int n, String name, String type, double buy, double sell) {
        this.code = String.format("MH%02d", n);
        this.name = name;
        this.type = type;
        this.buy = buy;
        this.sell = sell;
    }
    
    private void solveprofit(){
        profit = Math.round((sell - buy) * 100.0 ) / 100.0;
    }
    
    @Override
    public String toString(){
        solveprofit();
        return code + " " + name + " " + type + " " + String.format("%.2f", profit);
    }
    
    @Override
    public int compareTo(MatHang a){
        solveprofit();
        a.solveprofit();
        if(profit < a.profit) return 1;
        if(profit > a.profit) return -1;
        return 0;
    }
}
