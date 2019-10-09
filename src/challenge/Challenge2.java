/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

/**
 *
 * @author grand
 */
public class Challenge2 {
    
    public static void main (String []args){
             
             //Deklarasi Array
             double ratarata = 0;
             int nilai [] =new int [5];
             nilai [0] =88;
             nilai [1] =100;
             nilai [2] =63;
             nilai [3] =73;
             nilai [4] =80;
             
             
             //Mencari Rata-rata
             System.out.println("\n=====Menghitung Rata-Rata=====");
             System.out.println("Nilai 1= "+nilai[0]);
             System.out.println("Nilai 2= "+nilai[1]);
             System.out.println("Nilai 3= "+nilai[2]);
             System.out.println("Nilai 4= "+nilai[3]);
             System.out.println("Nilai 5= "+nilai[4]);
             for(int i=0; i<nilai.length; i++)ratarata+=nilai [i];
             ratarata/=nilai.length;
             System.out.println("\n~Nilai rata-rata= "+ratarata+"~");
             
             //Mengkategorikan Rata-rata
             System.out.println("\n=====Mengkategorikan Rata-rata=====");
             System.out.println("~Rata-rata kurang dari 75 termasuk rendah\n~Rata-rata lebih dari 75 termasuk tinggi");
             if(ratarata < 75){
                System.out.println("\nLmao noob\n!Anda termasuk rata-rata rendah.Awokawokawok!");
               
                
            }else System.out.println("\nWow pro player\n!Anda termasuk rata-rata tinggi!");
    
                
            
    }
}
             
         

