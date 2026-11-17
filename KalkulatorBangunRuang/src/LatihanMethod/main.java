/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMethod;
import java.util.Scanner;
import static kalkulatorbangunruang.KalkulatorBangunRuang.LatihanMethodMatematika.hitungLuasLingkaran;
import static kalkulatorbangunruang.KalkulatorBangunRuang.LatihanMethodMatematika.konversiCelciusKeReamur;
import static kalkulatorbangunruang.KalkulatorBangunRuang.LatihanMethodMatematika.tampilkanHeader;
/**
 *
 * @author ASUS
 */
  public class main {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        tampilkanHeader("Menghitung Luas Lingkaran");
        System.out.print("Masukkan jari-jari: ");
        double jarijari = input.nextDouble();
        double LuasLingkaran = hitungLuasLingkaran (jarijari);
        System.out.println("luas lingkaran = "+LuasLingkaran);
        
        tampilkanHeader("Konversi Suhu Celcius ke Reamur");
        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = input.nextDouble();
        double reamur = konversiCelciusKeReamur(celcius);
        System.out.println(celcius + " C = " + reamur + " R\n");
    }
 }