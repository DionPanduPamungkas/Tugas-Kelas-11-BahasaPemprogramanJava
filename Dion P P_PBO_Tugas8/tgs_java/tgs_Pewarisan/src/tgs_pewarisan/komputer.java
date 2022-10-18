/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs_pewarisan;

/**
 *
 * @author Owner
 */
public class komputer {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cpu c = new cpu();
        cpu cx = new cpu();
        monitor m = new monitor();
        monitor mx = new monitor();
        printer p = new printer();
        printer px = new printer();
        c.setjeniscpu("Intel Dan AMD");
        cx.setmerekcpu("Intel Core i3 Gen10 Dan AMD Ryzen 3 2200u");
        m.setjenismonitor("Monitor LCD");
        mx.setmerekmonitor("Dell S2417DG");
        p.setjenisprinter("Dot Matrik");
        px.setmerekprinter("Canon");

        System.out.println("============================================================");
        System.out.println("Jenis CPU     = "+c.getjeniscpu());
        System.out.println("Merek CPU     = "+cx.getmerekcpu());
        System.out.println("============================================================");
        System.out.println("Jenis Monitor = "+m.getjenismonitor());
        System.out.println("Merek Monitor = "+mx.getmerekmonitor());
        System.out.println("============================================================");
        System.out.println("Jenis Printer = "+p.getjenisprinter());
        System.out.println("Merek Printer = "+px.getmerekprinter());
        System.out.println("============================================================");
    }
    
}
