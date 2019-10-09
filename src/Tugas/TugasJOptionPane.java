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
public class TugasJOptionPane {
    public static void main (String[] args){
             
       String a,b;
       int nilai1;
       int nilai2;

              a= JOptionPane.showInputDialog("Masukan Nlai  A = ");
              b= JOptionPane.showInputDialog("Masukan Nilai B = ");
             
              nilai1 = Integer.parseInt(a);
              nilai2 = Integer.parseInt(b);
             
              int tambah = nilai1 + nilai2;
              int kurang = nilai1 - nilai2;
              int kali = nilai1 * nilai2;
              double bagi = nilai1 / nilai2;
              int modulus = nilai1 % nilai2;
             
JOptionPane.showMessageDialog(null, "Hasil dari " +nilai1+ " + " +nilai2+ " Adalah " +tambah);
JOptionPane.showMessageDialog(null, "Hasil dari " +nilai1+ " - " +nilai2+ " Adalah " +kurang);
JOptionPane.showMessageDialog(null, "Hasil dari " +nilai1+ " * " +nilai2+ " Adalah " +kali);
JOptionPane.showMessageDialog(null, "Hasil dari " +nilai1+ " / " +nilai2+ " Adalah " +bagi);
JOptionPane.showMessageDialog(null, "Hasil dari " +nilai1+ " % " +nilai2+ " Adalah " +modulus);
             
       }

}

