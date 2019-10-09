/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO;

import java.util.Scanner;

/**
 *
 * @author grand
 */
public class BiodataDiri {
    public static void main(String[] args) {
        Scanner huruf = new Scanner(System.in);
        Scanner angka = new Scanner(System.in);
        String huruf1;
        int angka1;
        char k;
        System.out.print("Nama            :");
        huruf1=huruf.nextLine();
        System.out.print("NIS             :");
        angka1=angka.nextInt();
        System.out.print("Tempat lahir    :");
        huruf1=huruf.nextLine();
        System.out.print("Tanggal lahir   :");
        angka1=angka.nextInt();
        System.out.print("Jenis Kelamin   :");
        huruf1=huruf.nextLine();
        System.out.print("Alamat di Malang:");
        huruf1=huruf.nextLine();
        System.out.print("Motto Hidup     :");
        huruf1=huruf.nextLine();
    }
}
