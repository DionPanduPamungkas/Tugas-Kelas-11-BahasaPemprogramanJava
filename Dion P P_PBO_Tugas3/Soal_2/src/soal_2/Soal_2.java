/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_2;
import java.util.Scanner;
/**
 *
 * @author Owner
 */
public class Soal_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int awal, akhir, bil;  
        System.out.println("Program Penampil Bilangan Prima");
        System.out.print("Masukkan batas awal\t: "); awal=in.nextInt();
        System.out.print("Masukkan batas akhir\t: "); akhir=in.nextInt();
        System.out.printf("Bilangan prima dari %d sampai %d adalah \n", awal, akhir);
        int ang=awal;
        while (ang <= akhir) {
            int tmp = 0;
            for (int bagi = 2; bagi < ang; bagi++) {
                if (ang%bagi==0) {
                    tmp=1;
                }
            }
            if (tmp != 1) {
                System.out.println(ang); 
                }
            ang++;
        }
    }
}

