/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_1;
import java.util.Scanner;
/**
 *
 * @author dion
 */
public class Soal_1 {
    static void header(String header){
        System.out.println(header);            
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner masukan = new Scanner(System.in);
        header("Program Penghitung Angsuran Hutang");
        int pinjaman, lamaAngsuran, bunga, angsuran, pembayaran;

        System.out.print("Masukkan besar pinjaman : ");
        pinjaman = masukan.nextInt();

        System.out.print("Masukkan lama angsuran (BULAN) : ");
        lamaAngsuran = masukan.nextInt();

        System.out.print("Masukkan besar bunga (%) : ");
        bunga = masukan.nextInt();

        angsuran = pinjaman/lamaAngsuran;

        for(int i=0; i<lamaAngsuran; i++){
           pembayaran = angsuran + (pinjaman * bunga / 100);
           System.out.println("Pembayaran bulan ke-"+(i+1)+" = "+pembayaran);
           pinjaman = pinjaman - angsuran;
        }

    }

}
    
