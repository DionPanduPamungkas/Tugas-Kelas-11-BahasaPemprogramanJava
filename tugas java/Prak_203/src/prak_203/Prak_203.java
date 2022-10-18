/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak_203;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Prak_203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("masukan nilai mata kuliahnya :");
        int nilai = masukan.nextInt();
        if (nilai >= 80)
            System.out.println("Nilai A");
        else if (nilai >= 70)
            System.out.println("Nilai B");
        else if (nilai >= 55)
            System.out.println("Nilai C");
        else if (nilai >= 40) 
            System.out.println("Nilai D");
        else 
            System.out.println("Nilai E");
    }
    
}
