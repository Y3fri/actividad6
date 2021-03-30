/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6;

/**
 *
 * @author YEFERSON
 */
public class CDeSalud extends Actividad6{
    private int fecha;
    public CDeSalud(String lugar,int fecha){
        super(lugar);
       this.fecha =fecha; 
    }
    
    public void mostrar3(){
        System.out.println("\nCentro de salud\nLugar: "+getLugar()+"\nfecha:"+fecha);
    }
}
