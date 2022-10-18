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
public class printer extends komputer{
    private String merekprinter;
    private String jenisprinter;
     
    public void setmerekprinter(String merekprinter){
        this.merekprinter = merekprinter;
    }
    public String getmerekprinter(){
        return merekprinter;
    }
    public void setjenisprinter(String jenisprinter){
        this.jenisprinter = jenisprinter;
    }
    public String getjenisprinter(){
        return jenisprinter;
    }
}
