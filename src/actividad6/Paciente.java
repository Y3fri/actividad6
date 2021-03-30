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
public class Paciente extends Actividad6{
    private int codigo;
    
    
    public Paciente(String nombre, String apellido, String sexo, String direc,int codigo){
        super(nombre,apellido,sexo,direc);
        this.codigo = codigo;
    }
   
    public void mostrar(){
        System.out.println("Datos del paciente\nCodigo: "+codigo+"\nNombre: "+getNombre()+"\nApellido: "+getApellido()+"\nSexo: "+getSexo()+"\nDireccion: "+getDirec());
    }
   
}
