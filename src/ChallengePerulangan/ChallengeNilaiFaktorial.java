package ChallengePerulangan;

/*
  int bil, hasil = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Sebuah Angka");
        bil = input.nextInt();
        for (int i = bil; i > 0; i--) {
            hasil = hasil * i;
        }
        System.out.println("Nilai faktorial dari "+ bil+" adalah "+hasil);
 */

import java.util.Scanner;

public class ChallengeNilaiFaktorial {
     public static void main(String[] args) {
         
         //Deklarasi
         int bil, hasil = 1;
         
         
         
         //Scanner
         Scanner oke = new Scanner(System.in);
         
         //Input
         System.out.println("===Challenge #1===");
         System.out.println("---Menghitung Nilai Faktorial---");
         System.out.print("Input Angka: ");
         bil = oke.nextInt();
         int i= bil;
         
         //Proses & Output
         while (i>0) 
         {
          hasil = hasil * i;
             i--;
         }
         
         System.out.println("Nilai faktorial dari " + bil + " adalah: " + hasil);
        
         
         
           
     
    


/*
celen 2


*/
int a,b,jumlah;
         

         System.out.println("==Silahkan Masukkan Nilai Suku Awal==");
         a = oke.nextInt();
          System.out.println("==Silahkan Masukkan Nilai Beda Antar Suku==");
          b = oke.nextInt();
           System.out.println("==Silahkan Masukkan Jumlah Suku==");
           jumlah = oke.nextInt();
           System.out.println();
           
           
           while (i <= jumlah){
                a+=b;
           System.out.print(a+" ");
           i++;
          
           }
          
         
     }
    
}

