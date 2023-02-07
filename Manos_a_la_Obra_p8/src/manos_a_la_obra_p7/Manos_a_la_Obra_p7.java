/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manos_a_la_obra_p7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author droa
 */
public class Manos_a_la_Obra_p7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // LISTAS
        ArrayList<Integer> numerosA = new ArrayList();
        
        int x = 20;
        
        try{
            boolean aux; // se puede hacer una excepción.... no usarlo en otas palabras.
            aux=numerosA.add(x);
        }catch(Exception e){
            System.out.println("Elemento no Adicionado");
        }
        System.out.println();    // Devuel true cuando se adiciona el elemento. Ideal para para usarlo con un try y catch.
       
        for (int i=0;i<5; i++){
            try{
               numerosA.add(x+i);
            }catch(Exception e ){
                System.out.println("No se adicionó el elemento "+(numerosA.size()-1));
            }
        }
        
        
        //int x = 30;
        //System.out.println(numerosA.add(x));  
        
        
        
        // CONJUNTOS
         HashSet<Integer> numerosB = new HashSet();
   
        Integer y = 20;
        numerosB.add(y);
        
        for (int i=0;i < 5; i++){
            try{
               numerosB.add(y+i);
            }catch(Exception e ){
                System.out.println("No se adicionó el elemento "+(numerosB.size()-1));
            }
        }

        // MAPAS
        HashMap<Integer, String> alumnos = new HashMap();
        
        int dni = 34576189;
        String nombreAlumno = "Pepe";
        alumnos.put(dni, nombreAlumno);
        
        for (int i=0;i < 5; i++){
            try{
               alumnos.put((dni+i),"Pepe_"+i);
            }catch(Exception e ){
                System.out.println("No se adicionó el elemento "+(alumnos.size()-1));
                
            }
        }
        
        // Eliminando Objetos Colecciones
        
        System.out.println("Imprimiento Colecciones ... ");
        System.out.println("ArrayLIst: ");
        numerosA.remove(3);
        
        // Eliminando con Iterators
        //ArrayLIst
        Iterator <Integer> it_Alr= numerosA.iterator();
       
        while(it_Alr.hasNext()){
           if(it_Alr.next().equals(20)){
            
               it_Alr.remove();
           }
        }
       
        //HashSet
        Iterator <Integer> it_Hs= numerosB.iterator();
        
        while(it_Hs.hasNext()){
           if(it_Hs.next()==22){
               it_Hs.remove();
           }
        }
        
        
        System.out.println("HashSet: ");
        numerosB.remove(20);
        
        System.out.println("HashMap: ");        
        alumnos.remove(34576193);
        
        //Ordenar Colleciones
        
        
        Collections.sort(numerosA);
        
        // Imprimier Colecciones
        
        System.out.println("Imprimiento Colecciones ... ");
        System.out.println("ArrayLIst: ");
        System.out.println(numerosA.toString());
        System.out.println("ArrayLIst Ordenado: ");
        System.out.println(numerosA.toString());
        //Con Iterador
        Iterator it_Al= numerosA.iterator();
         System.out.print("{");
        while(it_Al.hasNext()){
           
            System.out.print(" "+it_Al.next()+",");          
        }
        System.out.println("}");
        
        System.out.println("HashSet: ");
        System.out.println(numerosB.toString());
        System.out.println("HashSet Ordenado: ");
        ArrayList <Integer> numerosB_s=new ArrayList(numerosB);
        Collections.sort(numerosB_s);
        System.out.println(numerosB.toString());
        
        System.out.println("HashMap: ");        
        System.out.println("Con ToString:");
        System.out.println(alumnos.toString()); // no muestra hashcodes
        System.out.println("HashMap Ordenado: ");
        //HashMap <Integer,String> alumnos_s=new HashMap();
        TreeMap <Integer,String> alumnosTree =new TreeMap(alumnos);
        System.out.println(alumnosTree.toString());
        
        //
        //Con ITerator.
        // Mentores
        System.out.println("Con Iterator:"); 
        Iterator<Map.Entry<Integer,String>> it = alumnos.entrySet().iterator();        
        System.out.print("{");
        while(it.hasNext()){
            Map.Entry<Integer,String> auxIt = it.next();
            System.out.print(" "+auxIt.hashCode()+":"+auxIt.getKey()+"="+auxIt.getValue()+",");          
        }
        System.out.println("}");
        //Con for Ecahy
        // Jorge Opción ??
        System.out.println("Con ForEach:");
        System.out.print("{");
        for(Map.Entry<Integer, String> aux : alumnos.entrySet()){  
              
            System.out.print(" "+aux.hashCode()+":"+aux.getKey()+"="+aux.getValue()+",");
        }
        System.out.println("}");   
        
    }
   
    
}
