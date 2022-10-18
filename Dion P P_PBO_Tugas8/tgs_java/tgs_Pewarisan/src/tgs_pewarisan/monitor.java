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
public class monitor extends komputer{
    private String merekmonitor;
    private String jenismonitor;
    
    public void setmerekmonitor(String merekmonitor){
        this.merekmonitor = merekmonitor;
    }
    public String getmerekmonitor(){
        return merekmonitor;
    }
    public void setjenismonitor(String jenismonitor){
        this.jenismonitor = jenismonitor;
    }
    public String getjenismonitor(){
        return jenismonitor;
    }
}
