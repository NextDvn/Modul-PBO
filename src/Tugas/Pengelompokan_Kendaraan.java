/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author grand
 */
public class Pengelompokan_Kendaraan {

    public static void main(String[] args) {
        //Deklarasi
        Scanner input = new Scanner(System.in);
        int back;
        String menu, merk, nama, warna, type, motor, mobil, x, y, yes;

        //Awalan
        JOptionPane.showMessageDialog(null, "===Program Pencari Kendaraan Di Parkiran===\nNama anggota:\n  Bayu Swara Mahardika (04)\n  Gregorius Devon Bramantyo (11)\n  Memoreza Sabana (18)\n  Richmond Janus Rafi'i Aryanto (32)\n", "Kelompok Kendaraan", 1);
        menu = JOptionPane.showInputDialog(null, "Pilih Kendaraan Mobil atau Motor:", "Menu", 1);

        //Proses
        //Motor
        if (menu.equalsIgnoreCase("motor")) {
            merk = JOptionPane.showInputDialog(null, "Pilih Merk Kendaraan Motor Anda\n(Honda,Yamaha,Suzuki):", "Merk", 1);

            if (merk.equalsIgnoreCase("honda")) {
                nama = JOptionPane.showInputDialog(null, "Pilih Nama Kendaraan Motor Anda\n(CBR,Vario,Scoopy,Beat):", "Nama", 1);
                warna = JOptionPane.showInputDialog(null, "Pilih Warna Kendaraan Motor Anda\n(Putih,Biru,Hitam,Merah):", "Warna", 1);
                type = JOptionPane.showInputDialog(null, "Pilih Type Kendaraan Motor Anda\n(Matic,Manual):", "Type", 1);
                JOptionPane.showMessageDialog(null, "Keterangan Kendaraan Anda:" + "\nMerk Motor:" + merk + "\nNama Motor: " + nama + "\nWarna Motor: " + warna + "\nType Motor: " + type);
                back = JOptionPane.showConfirmDialog(null, "Anda Ingin Kembali Ke Menu?", "Return", JOptionPane.YES_NO_OPTION, 0);
                if (back == 0) {
                    Menu("");
                } else {
                    JOptionPane.showMessageDialog(null, "Terimakasih Telah Menggunakan Program Ini");
                    System.exit(0);
                }
            } else if (merk.equalsIgnoreCase("yamaha")) {
                nama = JOptionPane.showInputDialog(null, "Pilih Nama Kendaraan Motor Anda\n(Mio,Nmax,Vixion,Jupiter):", "Nama", 1);
                warna = JOptionPane.showInputDialog(null, "Pilih Warna Kendaraan Motor Anda\n(Putih,Biru,Hitam,Merah):", "Warna", 1);
                type = JOptionPane.showInputDialog(null, "Pilih Type Kendaraan Motor Anda\n(Matic,Manual):", "Type", 1);
                JOptionPane.showMessageDialog(null, "Keterangan Kendaraan Anda:" + "\nMerk Motor:" + merk + "\nNama Motor: " + nama + "\nWarna Motor: " + warna + "\nType Motor: " + type);
                back = JOptionPane.showConfirmDialog(null, "Anda Ingin Kembali Ke Menu?", "Return", JOptionPane.YES_NO_OPTION, 0);
                if (back == 0) {
                    Menu("");
                } else {
                    JOptionPane.showMessageDialog(null, "Terimakasih Telah Menggunakan Program Ini");
                    System.exit(0);
                }
            } else if (merk.equalsIgnoreCase("suzuki")) {
                nama = JOptionPane.showInputDialog(null, "Pilih Nama Kendaraan Motor Anda\n(Satria,Astrea):", "Nama", 1);
                warna = JOptionPane.showInputDialog(null, "Pilih Warna Kendaraan Motor Anda\n(Putih,Biru,Hitam,Merah):", "Warna", 1);
                type = JOptionPane.showInputDialog(null, "Pilih Type Kendaraan Motor Anda\n(Matic,Manual):", "Type", 1);
                JOptionPane.showMessageDialog(null, "Keterangan Kendaraan Anda:" + "\nMerk Motor:" + merk + "\nNama Motor: " + nama + "\nWarna Motor: " + warna + "\nType Motor: " + type);
                back = JOptionPane.showConfirmDialog(null, "Anda Ingin Kembali Ke Menu?", "Return", JOptionPane.YES_NO_OPTION, 0);
                if (back == 0) {
                    Menu("");
                } else {
                    JOptionPane.showMessageDialog(null, "Terimakasih Telah Menggunakan Program Ini");
                    System.exit(0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Pilihan Kendaraan Tidak Tersedia\nSilahkan ulangi lagi", "Error", 0);
                Menu("");
            }
        } //Mobil
        else if (menu.equalsIgnoreCase("mobil")) {
            merk = JOptionPane.showInputDialog(null, "Pilih Merk Kendaraan Mobil Anda\n(Daihatsu,Mitsubishi,Toyota):", "Merk", 1);

            if (merk.equalsIgnoreCase("daihatsu")) {
                nama = JOptionPane.showInputDialog(null, "Pilih Nama Kendaraan Mobil Anda\n(Xenia,Ayla,Terios,Grand max):", "Nama", 1);
                warna = JOptionPane.showInputDialog(null, "Pilih Warna Kendaraan Mobil Anda\n(Putih,Hitam,Silver):", "Warna", 1);
                type = JOptionPane.showInputDialog(null, "Pilih Type Kendaraan Mobil Anda\n(Matic,Manual):", "Type", 1);
                JOptionPane.showMessageDialog(null, "Keterangan Kendaraan Anda:" + "\nMerk Mobil: " + merk + "\nNama Mobil: " + nama + "\nWarna Mobil: " + warna + "\nType Mobil: " + type);
                back = JOptionPane.showConfirmDialog(null, "Anda Ingin Kembali Ke Menu?", "Return", JOptionPane.YES_NO_OPTION, 0);
                if (back == 0) {
                    Menu("");
                } else {
                    JOptionPane.showMessageDialog(null, "Terimakasih Telah Menggunakan Program Ini");
                    System.exit(0);
                }
            } else if (merk.equalsIgnoreCase("mitsubishi")) {
                nama = JOptionPane.showInputDialog(null, "Pilih Nama Kendaraan Mobil Anda\n(Pajero,Kuda,Xpander):", "Nama", 1);
                warna = JOptionPane.showInputDialog(null, "Pilih Warna Kendaraan Mobil Anda\n(Putih,Hitam,Silver):", "Warna", 1);
                type = JOptionPane.showInputDialog(null, "Pilih Type Kendaraan Mobil Anda\n(Matic,Manual):", "Type", 1);
                JOptionPane.showMessageDialog(null, "Keterangan Kendaraan Anda:" + "\nMerk Mobil: " + merk + "\nNama Mobil: " + nama + "\nWarna Mobil: " + warna + "\nType Mobil: " + type);
                back = JOptionPane.showConfirmDialog(null, "Anda Ingin Kembali Ke Menu?", "Return", JOptionPane.YES_NO_OPTION, 0);
                if (back == 0) {
                    Menu("");
                } else {
                    JOptionPane.showMessageDialog(null, "Terimakasih Telah Menggunakan Program Ini");
                    System.exit(0);
                }
            } else if (merk.equalsIgnoreCase("toyota")) {
                nama = JOptionPane.showInputDialog(null, "Pilih Nama Kendaraan Mobil Anda\n(Avanza,Agya,Innova,Sigra):", "Nama", 1);
                warna = JOptionPane.showInputDialog(null, "Pilih Warna Kendaraan Mobil Anda\n(Putih,Hitam,Silver):", "Warna", 1);
                type = JOptionPane.showInputDialog(null, "Pilih Type Kendaraan Mobil Anda\n(Matic,Manual):", "Type", 1);
                JOptionPane.showMessageDialog(null, "Keterangan Kendaraan Anda:" + "\nMerk Mobil: " + merk + "\nNama Mobil: " + nama + "\nWarna Mobil: " + warna + "\nType Mobil: " + type);
                back = JOptionPane.showConfirmDialog(null, "Anda Ingin Kembali Ke Menu?", "Return", JOptionPane.YES_NO_OPTION, 0);
                if (back == 0) {
                    Menu("");
                } else {
                    JOptionPane.showMessageDialog(null, "Terimakasih Telah Menggunakan Program Ini");
                    System.exit(0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Pilihan Kendaraan Tidak Tersedia\nSilahkan ulangi lagi", "Error", 0);
                Menu("");
            }
        }
    }

    //Menu
    private static void Menu(String yes) {
        //Deklarasi
        Scanner input = new Scanner(System.in);
        int back;
        String menu, merk, nama, warna, type, motor, mobil, x, y;

        //Awalan
        JOptionPane.showMessageDialog(null, "===Program Pencari Kendaraan Di Parkiran===\nNama anggota:\n  Bayu Swara Mahardika (04)\n  Gregorius Devon Bramantyo (11)\n  Memoreza Sabana (18)\n  Richmond Janus Rafi'i Aryanto (32)\n", "Kelompok Kendaraan", 1);
        menu = JOptionPane.showInputDialog(null, "Pilih Kendaraan Mobil atau Motor:", "Menu", 1);

        //Proses
        //Motor
        if (menu.equalsIgnoreCase("motor")) {
            merk = JOptionPane.showInputDialog(null, "Pilih Merk Kendaraan Motor Anda\n(Honda,Yamaha,Suzuki):", "Merk", 1);

            if (merk.equalsIgnoreCase("honda")) {
                nama = JOptionPane.showInputDialog(null, "Pilih Nama Kendaraan Motor Anda\n(CBR,Vario,Scoopy,Beat):", "Nama", 1);
                warna = JOptionPane.showInputDialog(null, "Pilih Warna Kendaraan Motor Anda\n(Putih,Biru,Hitam,Merah):", "Warna", 1);
                type = JOptionPane.showInputDialog(null, "Pilih Type Kendaraan Motor Anda\n(Matic,Manual):", "Type", 1);
                JOptionPane.showMessageDialog(null, "Keterangan Kendaraan Anda:" + "\nMerk Motor:" + merk + "\nNama Motor: " + nama + "\nWarna Motor: " + warna + "\nType Motor: " + type);
                back = JOptionPane.showConfirmDialog(null, "Anda Ingin Kembali Ke Menu?", "Return", JOptionPane.YES_NO_OPTION, 0);
                if (back == 0) {
                    Menu("");
                } else {
                    JOptionPane.showMessageDialog(null, "Terimakasih Telah Menggunakan Program Ini");
                    System.exit(0);
                }
            } else if (merk.equalsIgnoreCase("yamaha")) {
                nama = JOptionPane.showInputDialog(null, "Pilih Nama Kendaraan Motor Anda\n(Mio,Nmax,Vixion,Jupiter):", "Nama", 1);
                warna = JOptionPane.showInputDialog(null, "Pilih Warna Kendaraan Motor Anda\n(Putih,Biru,Hitam,Merah):", "Warna", 1);
                type = JOptionPane.showInputDialog(null, "Pilih Type Kendaraan Motor Anda\n(Matic,Manual):", "Type", 1);
                JOptionPane.showMessageDialog(null, "Keterangan Kendaraan Anda:" + "\nMerk Motor:" + merk + "\nNama Motor: " + nama + "\nWarna Motor: " + warna + "\nType Motor: " + type);
                back = JOptionPane.showConfirmDialog(null, "Anda Ingin Kembali Ke Menu?", "Return", JOptionPane.YES_NO_OPTION, 0);
                if (back == 0) {
                    Menu("");
                } else {
                    JOptionPane.showMessageDialog(null, "Terimakasih Telah Menggunakan Program Ini");
                    System.exit(0);
                }
            } else if (merk.equalsIgnoreCase("suzuki")) {
                nama = JOptionPane.showInputDialog(null, "Pilih Nama Kendaraan Motor Anda\n(Satria,Astrea):", "Nama", 1);
                warna = JOptionPane.showInputDialog(null, "Pilih Warna Kendaraan Motor Anda\n(Putih,Biru,Hitam,Merah):", "Warna", 1);
                type = JOptionPane.showInputDialog(null, "Pilih Type Kendaraan Motor Anda\n(Matic,Manual):", "Type", 1);
                JOptionPane.showMessageDialog(null, "Keterangan Kendaraan Anda:" + "\nMerk Motor:" + merk + "\nNama Motor: " + nama + "\nWarna Motor: " + warna + "\nType Motor: " + type);
                back = JOptionPane.showConfirmDialog(null, "Anda Ingin Kembali Ke Menu?", "Return", JOptionPane.YES_NO_OPTION, 0);
                if (back == 0) {
                    Menu("");
                } else {
                    JOptionPane.showMessageDialog(null, "Terimakasih Telah Menggunakan Program Ini");
                    System.exit(0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Pilihan Kendaraan Tidak Tersedia\nSilahkan ulangi lagi", "Error", 0);
                Menu("");
            }
        } //Mobil
        else if (menu.equalsIgnoreCase("mobil")) {
            merk = JOptionPane.showInputDialog(null, "Pilih Merk Kendaraan Mobil Anda\n(Daihatsu,Mitsubishi,Toyota):", "Merk", 1);

            if (merk.equalsIgnoreCase("daihatsu")) {
                nama = JOptionPane.showInputDialog(null, "Pilih Nama Kendaraan Mobil Anda\n(Xenia,Ayla,Terios,Grand max):", "Nama", 1);
                warna = JOptionPane.showInputDialog(null, "Pilih Warna Kendaraan Mobil Anda\n(Putih,Hitam,Silver):", "Warna", 1);
                type = JOptionPane.showInputDialog(null, "Pilih Type Kendaraan Mobil Anda\n(Matic,Manual):", "Type", 1);
                JOptionPane.showMessageDialog(null, "Keterangan Kendaraan Anda:" + "\nMerk Mobil: " + merk + "\nNama Mobil: " + nama + "\nWarna Mobil: " + warna + "\nType Mobil: " + type);
                back = JOptionPane.showConfirmDialog(null, "Anda Ingin Kembali Ke Menu?", "Return", JOptionPane.YES_NO_OPTION, 0);
                if (back == 0) {
                    Menu("");
                } else {
                    JOptionPane.showMessageDialog(null, "Terimakasih Telah Menggunakan Program Ini");
                    System.exit(0);
                }
            } else if (merk.equalsIgnoreCase("mitsubishi")) {
                nama = JOptionPane.showInputDialog(null, "Pilih Nama Kendaraan Mobil Anda\n(Pajero,Kuda,Xpander):", "Nama", 1);
                warna = JOptionPane.showInputDialog(null, "Pilih Warna Kendaraan Mobil Anda\n(Putih,Hitam,Silver):", "Warna", 1);
                type = JOptionPane.showInputDialog(null, "Pilih Type Kendaraan Mobil Anda\n(Matic,Manual):", "Type", 1);
                JOptionPane.showMessageDialog(null, "Keterangan Kendaraan Anda:" + "\nMerk Mobil: " + merk + "\nNama Mobil: " + nama + "\nWarna Mobil: " + warna + "\nType Mobil: " + type);
                back = JOptionPane.showConfirmDialog(null, "Anda Ingin Kembali Ke Menu?", "Return", JOptionPane.YES_NO_OPTION, 0);
                if (back == 0) {
                    Menu("");
                } else {
                    JOptionPane.showMessageDialog(null, "Terimakasih Telah Menggunakan Program Ini");
                    System.exit(0);
                }
            } else if (merk.equalsIgnoreCase("toyota")) {
                nama = JOptionPane.showInputDialog(null, "Pilih Nama Kendaraan Mobil Anda\n(Avanza,Agya,Innova,Sigra):", "Nama", 1);
                warna = JOptionPane.showInputDialog(null, "Pilih Warna Kendaraan Mobil Anda\n(Putih,Hitam,Silver):", "Warna", 1);
                type = JOptionPane.showInputDialog(null, "Pilih Type Kendaraan Mobil Anda\n(Matic,Manual):", "Type", 1);
                JOptionPane.showMessageDialog(null, "Keterangan Kendaraan Anda:" + "\nMerk Mobil: " + merk + "\nNama Mobil: " + nama + "\nWarna Mobil: " + warna + "\nType Mobil: " + type);
                back = JOptionPane.showConfirmDialog(null, "Anda Ingin Kembali Ke Menu?", "Return", JOptionPane.YES_NO_OPTION, 0);
                if (back == 0) {
                    Menu("");
                } else {
                    JOptionPane.showMessageDialog(null, "Terimakasih Telah Menggunakan Program Ini");
                    System.exit(0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Pilihan Kendaraan Tidak Tersedia\nSilahkan ulangi lagi", "Error", 0);
                Menu("");
            }
        }
    }
}
