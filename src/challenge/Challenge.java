/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

import java.util.Scanner;

/**
 *
 * @author grand
 */
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Deklarasi
        int harian;         int hasilharian;
        int laporan;        int hasillaporan;
        int ujian;          int hasilujian;
        int akhir;          int hasilakhir;
        
        //Scanner
        Scanner oke = new Scanner(System.in);
        
        //Pengambilan nilai2
        System.out.println("=====Program Penilaian Nilai Akhir Siswa=====");
            System.out.print("\nMasukkan Nilai Tugas Harian: ");
            harian = oke.nextInt();
            System.out.print("\nMasukkan Nilai Laporan: ");
            laporan = oke.nextInt();
            System.out.print("\nMasukkan Nilai Ujian: ");
            ujian = oke.nextInt();
            
        //Proses penghitungan nilai2
        System.out.print("\n=====Hasil Nilai Akhir=====");
        hasilharian = (harian * 30/100);
        System.out.print("\nHasil Nilai Tugas Harian: " + hasilharian);
        hasillaporan = (laporan * 20/100);
        System.out.print("\nHasil Nilai Laporan: " + hasillaporan);
        hasilujian = (ujian * 50/100);
        System.out.print("\nHasil Nilai Ujian: " + hasilujian);
        hasilakhir = hasilharian + hasillaporan + hasilujian;
        System.out.println("\nHasil Nilai Akhir: " + hasilakhir);
        
        //konversi nilai
         System.out.println("\n=====Konversi Nilai Angka Ke Huruf=====");
            if(hasilakhir <= 40) {
                System.out.println("Nilai Akhir = F");
               
                
            } else if(hasilakhir <=55) { 
                System.out.println("Nilai Akhir = E");
                
            } else if(hasilakhir <=74) {
                System.out.println("Nilai Akhir = D");
                
            } else if(hasilakhir <=85) {
                System.out.println("Nilai Akhir = C");
                
            } else if(hasilakhir <=92) {
                System.out.println("Nilai Akhir = B");
                
            } else if(hasilakhir <=100) {
                System.out.println("Nilai Akhir = A");
            }
                
        //menentukan kelulusan
        
            System.out.println("\n=====Penentuan Kelulusan Siswa=====");
            if(hasilakhir <= 55) {
                System.out.println("Anda tidak lulus,tingkatkan belajar anda");
               
                
            } else if(hasilakhir <=74) { 
                System.out.println("Anda tidak lulus,tingkatkan belajar anda");
                
            } else if(hasilakhir <=85) {
                System.out.println("Anda lulus dengan cukup,tingkatkan lagi prestasimu");
                
            } else if(hasilakhir <=92) {
                System.out.println("Anda lulus dengan baik,pertahankan prestasimu");
                
            } else if(hasilakhir <=100) {
                System.out.println("Anda lulus,Excellent");
                
            
    }
    
    }
}

