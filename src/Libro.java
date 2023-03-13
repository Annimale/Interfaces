/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Libro extends Publicacion implements Prestable{
    protected boolean prestado;

    public Libro(String codigo, String titulo, int anopub) {
        super(codigo, titulo, anopub);
        this.prestado = false;
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
        return super.toString()+ "Libro: " + "prestado=" + prestado +"\n";
    }
    
    
    public String devCodigo(){
        return this.codigo;
    }
    
    public int devAnopub(){
        return this.anopub;
    }
     
   public boolean prestar(){
       return this.prestado=true;
   }
   public boolean prestado(){
       return this.prestado;
   }
   public boolean devolver(){
       return this.prestado=false;
   }
}
