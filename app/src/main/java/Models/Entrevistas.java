package Models;

import java.sql.Blob;

public class Entrevistas {
    private Integer id;
    private String descripcion;
    private String nombres;
    private String telefonos;
    private String notas;
    private Blob imagen;

    public Entrevistas() {
        //
    }

    public Entrevistas(Integer id, String descripcion, String nombres, String telefonos, String notas, Blob imagen){
        this.id = id;
        this.descripcion = descripcion;
        this.nombres = nombres;
        this.telefonos = telefonos;
        this.notas = notas;
        this.imagen = imagen;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Blob getImagen() {
        return imagen;
    }

    public void setImagen(Blob imagen) {
        this.imagen = imagen;
    }
}
