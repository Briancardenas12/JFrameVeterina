
package modelo;

import java.util.ArrayList;


public class Mascota {
    
    // Son los Atributos de la clase
    private int codigo;
    private String nombreResponsable;
    private String nombreMascota;
    private String raza;
    private String numeroContacto;
    private ArrayList<Historial> historials;
    
    //Se inicializa el contructor unicamente con el ArrayList (Primer constructor)
    public Mascota() {
            historials = new ArrayList();
    }
    
    //Se crea el constructor con todos los atributos

    public Mascota(int codigo, String nombreResponsable, String nombreMascota, String raza, String numeroContacto, ArrayList<Historial> historials) {
        this.codigo = codigo;
        this.nombreResponsable = nombreResponsable;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.numeroContacto = numeroContacto;
        this.historials = historials;
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }


    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }


    public String getNombreMascota() {
        return nombreMascota;
    }


    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }


    public String getRaza() {
        return raza;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }


    public String getNumeroContacto() {
        return numeroContacto;
    }


    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }


    public ArrayList<Historial> getHistorials() {
        return historials;
    }


    public void setHistorials(ArrayList<Historial> historials) {
        this.historials = historials;
    }  
}
