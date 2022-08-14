/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.or;

public class Estudiante {
    
    Scanner entrada = new Scanner(System.in);
    public String nombre;
    public int edad;
    public String carrera;
    public int año;    
    public int notas[] = new int[100];
    
    public void Nombre(){
        System.out.println("********DATOS********");
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Carrera cursando: ");
        carrera = entrada.nextLine();
        System.out.println("Año: ");
        año = entrada.nextInt();
         
        System.out.println("********NOTAS********");
        for(int i=1; i<=3; i++){
           System.out.println("Ingrese la nota "+i+":");
           notas[i] = entrada.nextInt();
           
        }
        
        
    }
    public void Mostrar(){
            if("Medicina".equals(carrera)){
                System.out.println("Imprimir boleta de Notas"); 
                
                System.out.println("************************************");
                System.out.println("NOTAS DE:"+nombre);
                for(int i=1; i<=3; i++){
                System.out.println("Nota"+i+": "+notas[i]);
                 System.out.println("************************************");
                }
            }
            else
            {
                System.out.println("************************************");
                System.out.println("DIRIGIR MENSAJE A PADRES DE FAMILIA");
                System.out.println("DEL ALUMNO: "+nombre);
                System.out.println("************************************");

            }
        }
}
