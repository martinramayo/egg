/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import entidades.Libro;
import java.util.Scanner;

/**
 *Crear una clase llamada Libro que contenga los siguientes atributos:
 * ISBN, Título, Autor, Número de páginas, y un constructor con todos los
 * atributos pasados por parámetro y un constructor vacío. Crear un método para
 * cargar un libro pidiendo los datos al usuario y luego informar mediante otro
 * método el número de ISBN, el título, el autor del libro y el numero de
 * páginas.
 * 
 * @author Usuario
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
     Libro L1=new Libro(leer.nextInt(),leer.next(),leer.next(),leer.nextInt());
     System.out.println(L1.isbn+" "+L1.autor+" "+L1.titulo+" "+L1.numeropaginas);
     
     
        
        
       
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        // TODO code application logic here
    }
    
}
