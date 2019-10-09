/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author grand
 */
public class KalkulatorSederhana {
     
    //Penjumlahan
    public static void Penjumlahan(int a,int b)
    {
        int c=a+b;
        System.out.println("Hasilnya adalah= "+c);  
    }
    
    //Pengurangan
    public static void Pengurangan(int a,int b)
    {
        int c=a-b;
        System.out.println("Hasilnya adalah= "+c);  
    }
    
    //Perkalian
    public static void Perkalian(int a,int b)
    {
        int c=a*b;
        System.out.println("Hasilnya adalah= "+c);  
    }
    
    //Pembagian
    public static void Pembagian(int a,int b)
    {
        double c=a/b;
        System.out.println("Hasilnya adalah= "+c);  
    }
    
    //Sisa Hasil bagi
    public static void SisaHasilBagi(int a,int b)
    {
        if(a>b){
            System.out.println("Hasil: " +(a%b));
        }else if(a<b){
            System.out.println("Hasil: Error.");
        }
         
    }
    
    //untuk pengulangan
    public static void Menu(int pilihan)
    {
        Scanner input = new Scanner(System.in);
        int i = 0;
        String pilihan2;
        
        System.out.println("\n=====KALKULATOR SEDERHANA=====");
        System.out.println("Menu Operasi:");
        System.out.println(" 1.Penjumlahan");
        System.out.println(" 2.Pengurangan");
        System.out.println(" 3.Perkalian");
        System.out.println(" 4.Pembagian");
        System.out.println(" 5.Sisa hasil bagi(Modulus)");
        System.out.print("Pilih operasi(1,2,3,4,5): ");
        pilihan=input.nextInt();
        
        if(pilihan==1)
        {
            int bil1,bil2;
            System.out.println("\n==Operasi Penjumlahan==");
            System.out.print("Masukkan bilangan pertama: ");
            bil1=input.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            bil2=input.nextInt();
            Penjumlahan(bil1,bil2);
            System.out.print("\nApakah anda ingin berhenti atau kembali ke menu?\n(0/1) \n");
            pilihan=input.nextInt();
            if(pilihan==1)
            {
                Menu(pilihan);
            }else System.out.println("Finish.");
        
        }else if(pilihan==2)
        {
            int bil3,bil4;
            System.out.println("\n==Operasi Pengurangan==");
            System.out.print("Masukkan bilangan pertama: ");
            bil3=input.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            bil4=input.nextInt();
            Pengurangan(bil3,bil4);
            System.out.print("\nApakah anda ingin berhenti atau kembali ke menu?\n(0/1) \n");
            pilihan=input.nextInt();
            if(pilihan==1)
            {
                Menu(pilihan);
            }else System.out.println("Finish.");
        
        }else if(pilihan==3)
        {
            int bil5,bil6;
            System.out.println("\n==Operasi Perkalian==");
            System.out.print("Masukkan bilangan pertama: ");
            bil5=input.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            bil6=input.nextInt();
            Perkalian(bil5,bil6);
            System.out.print("\nApakah anda ingin berhenti atau kembali ke menu?\n(0/1) \n");
            pilihan=input.nextInt();
            if(pilihan==1)
            {
                Menu(pilihan);
            }else System.out.println("Finish.");
        
        }else if(pilihan==4)
        {
            int bil7,bil8;
            System.out.println("\n==Operasi Pembagian==");
            System.out.print("Masukkan bilangan pertama: ");
            bil7=input.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            bil8=input.nextInt();
            Pembagian(bil7,bil8);
            System.out.print("\nApakah anda ingin berhenti atau kembali ke menu?\n(0/1) \n");
            pilihan=input.nextInt();
            if(pilihan==1)
            {
                Menu(pilihan);
            }else System.out.println("Finish.");
        
        }else if(pilihan==5)
        {
            int bil9,bil10;
            System.out.println("\n==Operasi Sisa Hasil Bagi==");
            System.out.print("Masukkan bilangan pertama: ");
            bil9=input.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            bil10=input.nextInt();
            SisaHasilBagi(bil9,bil10);
            System.out.print("\nApakah anda ingin berhenti atau kembali ke menu?\n(0/1) \n");
            pilihan=input.nextInt();
            if(pilihan==1)
            {
                Menu(pilihan);
            }else System.out.println("Finish.");
        }
    }
    
    //main method
    public static void main(String[]args)
    {
        
        Scanner input = new Scanner(System.in);
        int i = 0,pilihan;
        String pilihan2;
        
        System.out.println("=====KALKULATOR SEDERHANA=====");
        System.out.println("Menu Operasi:");
        System.out.println(" 1.Penjumlahan");
        System.out.println(" 2.Pengurangan");
        System.out.println(" 3.Perkalian");
        System.out.println(" 4.Pembagian");
        System.out.println(" 5.Sisa hasil bagi(Modulus)");
        System.out.print("Pilih operasi(1,2,3,4,5): ");
        pilihan=input.nextInt();
        
        if(pilihan==1)
        {
            int bil1,bil2;
            System.out.println("\n==Operasi Penjumlahan==");
            System.out.print("Masukkan bilangan pertama: ");
            bil1=input.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            bil2=input.nextInt();
            Penjumlahan(bil1,bil2);
            System.out.print("\nApakah anda ingin berhenti atau kembali ke menu?\n(0/1) \n");
            pilihan=input.nextInt();
            if(pilihan==1)
            {
                Menu(pilihan);
            }else System.out.println("Finish.");
        
        }else if(pilihan==2)
        {
            int bil3,bil4;
            System.out.println("\n==Operasi Pengurangan==");
            System.out.print("Masukkan bilangan pertama: ");
            bil3=input.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            bil4=input.nextInt();
            Pengurangan(bil3,bil4);
            System.out.print("\nApakah anda ingin berhenti atau kembali ke menu?\n(0/1) \n");
            pilihan=input.nextInt();
            if(pilihan==1)
            {
                Menu(pilihan);
            }else System.out.println("Finish.");
        
        }else if(pilihan==3)
        {
            int bil5,bil6;
            System.out.println("\n==Operasi Perkalian==");
            System.out.print("Masukkan bilangan pertama: ");
            bil5=input.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            bil6=input.nextInt();
            Perkalian(bil5,bil6);
            System.out.print("\nApakah anda ingin berhenti atau kembali ke menu?\n(0/1) \n");
            pilihan=input.nextInt();
            if(pilihan==1)
            {
                Menu(pilihan);
            }else System.out.println("Finish.");
        
        }else if(pilihan==4)
        {
            int bil7,bil8;
            System.out.println("\n==Operasi Pembagian==");
            System.out.print("Masukkan bilangan pertama: ");
            bil7=input.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            bil8=input.nextInt();
            Pembagian(bil7,bil8);
            System.out.print("\nApakah anda ingin berhenti atau kembali ke menu?\n(0/1) \n");
            pilihan=input.nextInt();
            if(pilihan==1)
            {
                Menu(pilihan);
            }else System.out.println("Finish.");
        
        }else if(pilihan==5)
        {
            int bil9,bil10;
            System.out.println("\n==Operasi Sisa Hasil Bagi==");
            System.out.print("Masukkan bilangan pertama: ");
            bil9=input.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            bil10=input.nextInt();
            SisaHasilBagi(bil9,bil10);
            System.out.print("\nApakah anda ingin berhenti atau kembali ke menu?\n(0/1) \n");
            pilihan=input.nextInt();
            if(pilihan==1)
            {
                Menu(pilihan);
            }else System.out.println("Finish.");
        }
        
    }
    
}
