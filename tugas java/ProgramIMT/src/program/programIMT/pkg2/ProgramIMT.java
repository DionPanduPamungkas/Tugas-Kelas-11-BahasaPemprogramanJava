package program.programIMT.pkg2;
import java.util.Scanner;
public class ProgramIMT {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float tinggi, berat, IMT;
        System.out.println("Masukan Tinggi Badan Anda (M) = ");
        tinggi = masukan.nextFloat();
        System.out.println("Masukan Berat Badan Anda (KG) = ");
        berat = masukan.nextFloat();
        IMT = berat / (tinggi*tinggi);
        System.out.println();
        if(IMT >=30)
            System.out.println("Berat Badan Anda = Kegemukan (obesitas) ");
        else if ((IMT > 30))
            System.out.println("Berat Badan Anda = Gemuk");
        else if ((IMT < 25))
            System.out.println("Berat Badan Anda Normal");
        else if ((IMT < 18.5))
            System.out.println("Berat Bada Anda = Kurus");
         else if ((IMT < 18.5))
            System.out.println();
            System.out.println("Dokter REKAYASA PERANGKAT LUNAK ");
    }
}