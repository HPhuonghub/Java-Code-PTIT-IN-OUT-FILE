/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Files;
import java.util.*;
import java.io.*;
/**
 *
 * @author DELL
 */
class WordSet {

    Set<String> set;

    public WordSet(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        set = new TreeSet<>();
        while (sc.hasNext()) {
            set.add(sc.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (String i : set)
            s += i + "\n";
        return s;
    }
}
public class lietketukhacnhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
