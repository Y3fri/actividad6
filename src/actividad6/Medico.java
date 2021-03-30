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
public class Medico extends Actividad6{ 


     public Medico(String nMedico, String motivoCons){
        super(nMedico,motivoCons);
    
     }
    public void mostrar2(){
        System.out.println("\nDatos del medico\nNombre: "+getnMedico()+"\nMotivo de la consulta: "+getMotivoCons());
    }

    
}

