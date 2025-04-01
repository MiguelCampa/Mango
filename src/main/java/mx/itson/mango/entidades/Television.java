/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mango.entidades;

/**
 *
 * @author alumnog
 */
public class Television extends DispositivoElectronico {
    
    private int pulgadas; 
    private int volumenActual;
   
    public Television(String marca, String modelo, String color , int pulgadas , int volumenActual){
        super( marca,  modelo, color);
        this.pulgadas = pulgadas;
        this.volumenActual = volumenActual;
        
        
    }
    public String cambiarVolumen (int cantidad){
 if(cantidad > 0 && cantidad < 100){
     this.volumenActual = cantidad;
     return "se cambio el volumen a" + cantidad;
 }else{
     return "el valor debe estar entre medio de 0 y 100";
 }
}
}