/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expedisi_04111055.master;

/**
 *
 * @author ArDhiye
 */
public class masukan {
    private int  value;
    private String label;

    public masukan(int id,String label){
        this.value= id;
        this.label = label;
    }

    public int getValue(){
        return this.value;

    }

    public String getLabel(){
        return this.label;
    }    
}
