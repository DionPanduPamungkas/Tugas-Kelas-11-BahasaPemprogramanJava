/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak_201;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Prak_201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.println("masukan nilai akhir mata kuliahnya");
        nilai = masukan.nextInt();
        if (nilai < 55) 
            System.out.println("mahasiswa tersebut tidak lulus");
    }
}
