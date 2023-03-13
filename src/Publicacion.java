/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Publicacion {
    protected  String codigo;
    protected String titulo;
    protected int anopub;

    public Publicacion(String codigo, String titulo, int anopub) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anopub = anopub;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnopub() {
        return anopub;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnopub(int anopub) {
        this.anopub = anopub;
    }

    @Override
    public String toString() {
        return "\n"+"Publicacion: " + "codigo=" + codigo + ", titulo=" + titulo + ", anopub=" + anopub +"\n";
    }
    
    
    
    
}
