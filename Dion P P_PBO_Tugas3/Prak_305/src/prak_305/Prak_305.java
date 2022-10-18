/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak_305;
import java.util.Scanner;
/**
 *
 * @author dion
 */
public class Prak_305 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);
        int n=0, total=0, bil=9;
        while (bil!=0){
            n++;
            System.out.println("Masukan Bilangan Ke-"+n+" : ");
            bil = masukan.nextInt();
            total += bil;
        }
        System.out.println("Total Jumlah "+(n-1)+" bilangan tsb : ");
        System.out.println(total);
    }
    
}
