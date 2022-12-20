/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop_pair;
import java.io.*;
/**
 *
 * @author DELL
 */
class Pair<T1, T2> {
    T1 first;
    T2 second;

    Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    boolean nto(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    boolean isPrime() {
        if (nto((Integer) first) && nto((Integer) second))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return first + " " + second;
    }
}
