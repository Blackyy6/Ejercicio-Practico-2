/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cancion;

public class Cancion {
    private int ID;
    private String Title;
    private String Author;
    private int Time;
    private int Year;
    
    
    public Cancion(int ID, String Title, String Author, int Time, int Year){
        this.ID = ID;
        this.Title = Title;
        this.Author = Author;
        this.Time = Time;
        this.Year = Year;
    }
    
    //getters
    
    public int getID (){
        return ID;
    }
    
    public String getTitle(){
        return Title;
    }
    
    public String getAuthor(){
        return Author;
    }
    
    public int getTime(){
        return Time;
    }
    
    public int getYear(){
        return Year;
    }
    
    //setters
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public void setTitle(String Title){
        this.Title = Title;
    }
    
    public void setAuthor(String Author){
        this.Author = Author;
    }
    
    public void setTime(int Time){
        this.Time = Time;
    }
    
    public void setYear(int Year){
        this.Year = Year;
    }
}
