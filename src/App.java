
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ivamar
 */
public class App {

    public static int cuentaPrestado(ArrayList<Publicacion> lista) {
        int contadorPrestados = 0;

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i) instanceof Libro) {
                if (((Prestable) (lista.get(i))).prestado()) {
                    contadorPrestados++;
                }

            }

        }
        return contadorPrestados;
    }

    public static int publicacionesAnteriores(ArrayList<Publicacion> liste, int anoAnt) {
        int contadorPublicaciones = 0;
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) instanceof Revista) {
                if (((Revista) (liste.get(i))).getAnopub() < anoAnt) {
                    contadorPublicaciones++;
                }
            }

        }
        return contadorPublicaciones;
    }

    public static void main(String[] args) {

        ArrayList<Publicacion> lista = new ArrayList(4);

        Libro l1 = new Libro("12344L", "Libro1", 1244);
        Libro l2 = new Libro("12399Y", "Libro2", 1998);
        lista.add(l1);
        lista.add(l2);

        Revista r1 = new Revista(12, "655P", "Revista Titulo1", 1566);
        Revista r2 = new Revista(12, "144P", "Revista Titulo2", 15120);
        lista.add(r1);
        lista.add(r2);

        l1.setPrestado(true);

        System.out.println(lista.toString());
        System.out.println("\n");
        System.out.println("\nLibros prestados:  " + cuentaPrestado(lista));
        System.out.println("Revistas anteriores a 1899:  " + publicacionesAnteriores(lista, 1899));

    }
}
