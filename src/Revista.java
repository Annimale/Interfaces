/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Revista  extends Publicacion{
    protected int numero;

    public Revista(int numero, String codigo, String titulo, int anopub) {
        super(codigo, titulo, anopub);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
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

    public void setNumero(int numero) {
        this.numero = numero;
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
        return super.toString() +"Revista: " + "numero=" + numero +"\n";
    }
    
    
    
    
}
