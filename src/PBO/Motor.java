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
public class Motor {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.setMerk("");
        motor.setNama("");
    }
    private void setMerk(String merk) {
        merk = "honda";
        System.out.println("Merk motor adalah :" + merk);
    }
    private void setNama(String nama) {
        nama = "beat";
        System.out.println("Nama motor adalah :" + nama);
    }
}
