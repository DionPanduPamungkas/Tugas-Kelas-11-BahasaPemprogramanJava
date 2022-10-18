/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak_206;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Prak_206 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan nilai Matematika-nya :");
        int matematika = masukan.nextInt();
        System.out.print("Masukan Nilai Fisikanya :");
        int fisika = masukan.nextInt();
        if ((matematika > 80) && (fisika > 70))
            System.out.println("Siswa tersebut DITERIMA");
        else
            System.out.println("Siswa Tersebut TIDAK DITERIMA");
    }
    
}
