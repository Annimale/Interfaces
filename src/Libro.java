/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Libro extends Bibliotek{
    protected boolean prestado;

    public Libro(boolean prestado, String codigo, String titulo, int anopub) {
        super(codigo, titulo, anopub);
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
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

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
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
        return "Libro: " + "prestado=" + prestado ;
    }
    
    
    
    
}
