/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulatorbangunruang;

/**
 *
 * @author ASUS
 */
public class KalkulatorBangunRuang {

 
public class LatihanMethodMatematika {
    public static double hitungLuasLingkaran(double jarijari){
       double LuasLingkaran=(3.14 * jarijari * jarijari);
       return LuasLingkaran;       
    }
public static double konversiCelciusKeReamur(double celcius) {
        double reamur = (4.0/5.0 * celcius);
        return reamur;
    }    
        
       // Method Void: Menampilkan Header/Banner dekoratif
    public static void tampilkanHeader(String judul) {
        System.out.println(" ");
        System.out.println("===+==========================+==");
        System.out.println("  " + judul.toUpperCase());
        System.out.println("===+==========================+==");
        
    }
}
}
