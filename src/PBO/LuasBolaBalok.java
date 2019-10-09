/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO;

/**
 *
 * @author grand
 */
public class LuasBolaBalok {
    public static void main(String[] args) {
        int p= 5;
        int l= 10; 
        int t= 5;
        int r= 14;
        System.out.println("Nilai Panjang balok =" + p);
        System.out.println("Nilai Lebar Balok =" + l);
        System.out.println("Nilai Tinggi Balok =" + t);
        System.out.println("===========================");
        System.out.println("Menghitung Luas Permukaan Balok");
        System.out.println("============================");
        System.out.println("Luas Permukaan Balok = " + ((2*p*l)+(2*p*t)+(2*l*t)));
        System.out.println("============================");
        System.out.println("Nilai Jari-Jari Bola =" + r);
        System.out.println("============================");
        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.println("============================");
        System.out.println("Luas Permukaan Bola = " + (4 * 14 * 14 * 22/7));
    }
}
