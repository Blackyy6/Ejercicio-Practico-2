/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cancion;
public class Main {

    public static void main(String[] args) {
        Cancion cancion = new Cancion(1, "Trance", "Metro", 180, 2023);
        
        System.out.println("Id de la cancion: " + cancion.getID());
        System.out.println("Titulo de la cancion: " + cancion.getTitle());
        System.out.println("Autor de la cancion: " + cancion.getAuthor());
        System.out.println("Duracion de la cancion: " + cancion.getTime());
        System.out.println("Anio de la cancion: " + cancion.getYear());
        
        System.out.println();
    }
    
}
