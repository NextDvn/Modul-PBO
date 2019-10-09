/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import javax.swing.JOptionPane;

/**
 *
 * @author grand
 */
class setor {
    private int saldo;
    public void menabung(int bal, int s){
        if(s%100!=0)
            JOptionPane.showMessageDialog(null,
                    "Mesin ATM BRM tidak menerima gopek \nSilahkan ulangi kembali!",
                    "Transaksi Gagal",0);
        else if(s<50000)
            JOptionPane.showMessageDialog(null,
                    "Besaran minimal setor tunai adalah Rp 50000","ERERE 404",0);
        else if(s>50000){
            saldo=bal+s;
            JOptionPane.showMessageDialog(null,
                    "Saldo Anda saat ini sebesar: "+saldo);
        }}
    public int getsaldo(){
        return saldo;
    }
    }
    

