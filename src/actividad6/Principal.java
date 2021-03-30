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
public class Principal {
    public static void main(String[] args) {
        Paciente p=new Paciente("Alex","Gonzales","Masculino","Cr4#12",12);
        Medico m=new Medico("Diego","Dolor de espalda");
        CDeSalud c=new CDeSalud("Hospital san rafael",22);
        p.mostrar();
        m.mostrar2();
        c.mostrar3();
        
    }
}
