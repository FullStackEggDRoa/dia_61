/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manos_a_la_obra_p14;

import java.util.ArrayList;
import manos_a_la_obra_p14.Entidades.Libros;
import manos_a_la_obra_p14.Servicios.serviciosLibros;

/**
 *
 * @author droa
 */
public class Manos_a_la_Obra_p14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Libros> coleccion_libros = new ArrayList();
        serviciosLibros sL = new serviciosLibros();
        for(int i=0;i<3;i++){
            Libros l1 = sL.crearLibro();            
            coleccion_libros.add(l1);
        }
        
        System.out.println("Imprimir Libros: ");
        
        for(Libros ejemplar : coleccion_libros){
            System.out.println(ejemplar);
        }
        
    }
    
}
