/*
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
 *Autor, Número de páginas, y un constructor con todos los atributos pasados por
 *parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
 *datos al usuario y luego informar mediante otro método el número de ISBN, el título,
 *el autor del libro y el numero de páginas.To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Libro {
    
    public int isbn;
    public String titulo;
    public String autor;
    public int numeropaginas;
    public String atrib1;
    private String atrib2;
    
    

    public Libro(int isbn, String titulo, String autor, int numeropaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
    }

    
  

 
 
    
    
}
