
package actividad6;


public class Actividad6 {
    private String nombre;
    private String apellido;
    private String sexo;
    private String direc;
    private String nMedico;
    private String motivoCons;
    private String lugar;

    public Actividad6(String nombre, String apellido, String sexo, String direc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.direc = direc;
       
    }

    public Actividad6(String nMedico, String motivoCons ) {
        this.nMedico = nMedico;
        this.motivoCons = motivoCons;
    }

    public Actividad6(String lugar) {
        this.lugar = lugar;
    }
//
    public String getMotivoCons() {
        return motivoCons;
    }

    public String getLugar() {
        return lugar;
    }

    public String getnMedico() {
        return nMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

   public String getSexo() {
        return sexo;
    }

    public String getDirec() {
        return direc;
    }

   
   
    
}
