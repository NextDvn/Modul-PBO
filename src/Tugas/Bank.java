/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import javax.swing.JOptionPane;

/**
 *
 * @author H4NS
 */
public class Bank {

    public static void main(String args[]) {
        String str, str1;

        int choice, z, pin = 1234, counter = 0, a = 3;
        int t, s, tab = 50000;

        JOptionPane.showMessageDialog(null, "  ==Selamat Datang== \nBank Rakyat Mars(BRM) \n\nKetik OK untuk masuk", "Bik OK untuk masuank Rakyat Mars (BRM)", 1);

        try {
            do {

                str = JOptionPane.showInputDialog(null, "Masukkan PIN Anda:",
                        "Bank Rakyat Mars (BRM)", 0);
                pin = Integer.parseInt(str);
                counter += 1; //menghitung kesempatan login

                if (pin == 1234)//cek pin
                {
                    do {
                        str
                                = JOptionPane.showInputDialog(null, "[1] INFORMASI SALDO \n[2]PENYETORAN \n[3] PENARIKAN \n[4] PETUNJUK \n[5] KELUAR \n\nMasukkan Pilihan Menu:", "Pilih Transaksi", 3);

                        choice = Integer.parseInt(str);

                        switch (choice) {
                            case 1:

                                JOptionPane.showMessageDialog(null, "Saldo Anda saat ini sebesar : " + tab); //informasi saldo

                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "Bank Rakyat Mars (BRM)", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                if (z == 0) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Bank Rakyat Mars, ambil kartu ATM Anda.");
                                }

                                System.exit(0);

                            case 2:

                                str1 = JOptionPane.showInputDialog(null, "Masukkan jumlah penyetoran: "); //menabung
                                s = Integer.parseInt(str1);
                                menabung(tab, s);
                                tab = getsaldo();

                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "Bank Rakyat Mars (BRM)", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                if (z == 0) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan ATM Bank Rakyat Mars, ambil kartu ATM Anda.");
                                }
                                System.exit(0);

                            case 3:

                                str1 = JOptionPane.showInputDialog(null, "Masukkan jumlah penarikan : "); //pengambilan

                                t = Integer.parseInt(str1);
                                ambil(tab, t);
                                tab = getsaldo();

                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "Bank Rakyat Mars (BRM)", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                if (z == 0) {
                                    break;
                                } else {

                                }
                            case 4:

                                JOptionPane.showMessageDialog(null, "Cara Penggunaan Aplikasi\n[1] Masukkan PIN dengan benar\n[2] Bertransaksilah dengan benar sesuai pilihan\n[3] Gunakan Uang sesuai kebutuhan dan rajinlah menabung\n ", "Bank Rakyat Mars (BRM)", 1);
                                break;

                            case 5:
                                z = JOptionPane.showConfirmDialog(null, "Anda ingin keluar?", "Keluar", JOptionPane.YES_NO_OPTION, 0);

                                if (z == 0) {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan ATM Bank Rakyat Mars, ambil kartu ATM Anda");
                                    System.exit(0);
                                } else {
                                    break;
                                }

                            default:
                                JOptionPane.showMessageDialog(null, "Pilihan menu tidak tersedia\nSilahkan ulangi lagi", "ERERE 404", 0);
                        }
                    } while (1 == 1);
                } else if (counter < 3) {	//jika pin salah

                    a--; //menghitung kesalahan login dan memberikan kesempatan login

                    JOptionPane.showMessageDialog(null, "Pin Salah !\nPastikan PIN yang anda masukkan benar", "ERERE 404", 0);

                    JOptionPane.showMessageDialog(null, "\nKesempatan login " + a + " kali lagi" + "\n");

                } else {

                    JOptionPane.showMessageDialog(null, "Untuk bantuan nasabah,\nsilahkan menghubungi call center 081336267047", "Kartu ATM anda diblokir! (KAPOQ)", 0);

                    System.exit(0);
                }
            } while (1 == 1);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Kesalahan!\nPastikan kode yang anda masukkan berformat benar! \nPROGRAM KELUAR!", "ERERE 404", 0);

        }
    }

    private static int saldo;

    private static void menabung(int tab, int s) {
        if (s % 100 != 0) {
            JOptionPane.showMessageDialog(null,
                    "Mesin ATM BRM tidak menerima gopek \nSilahkan ulangi kembali!",
                    "Transaksi Gagal", 0);
        } else if (s < 50000) {
            JOptionPane.showMessageDialog(null,
                    "Besaran minimal setor tunai adalah Rp 50000", "ERERE 404", 0);
        } else if (s >= 50000) {
            saldo = tab + s;
            JOptionPane.showMessageDialog(null,
                    "Saldo Anda saat ini sebesar: " + saldo);
        }
    }

    private static void ambil(int tab, int t) {
        if (t % 100 != 0) {
            JOptionPane.showMessageDialog(null,
                    "Mesin ATM BRM tidak menerima gopek \nSilahkan ulangi lagi!",
                    "Transaksi Gagal", 0);
        } else {
            if (t > tab) {
                JOptionPane.showMessageDialog(null,
                        "Saldo Anda tidak mencukupi \nSilahkan lakukan penyetoran", "Transaksi gagal", 0);
            }
            if (t < 50000) {
                JOptionPane.showMessageDialog(null,
                        "Besaran minimal pengambilan tunai adalah Rp 50000", "Transaksi Gagal", 0);
            } else {
                 saldo = tab - t;
                JOptionPane.showMessageDialog(null,
                        "Saldo Anda saat ini sebesar: " + saldo);
                JOptionPane.showMessageDialog(null,
                        "Saldo minimal harus Rp 50000, Segera lakukan penyetoran untuk menghindari penutupan akun.",
                        "CAUTION!", 2);
            }
        }
    }

    public static int getsaldo() {
        return saldo;
    }

}
