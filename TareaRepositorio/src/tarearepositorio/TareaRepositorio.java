/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarearepositorio;

import java.util.Scanner;

/**
 *
 * @author PC 10
 */
public class TareaRepositorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hola a Todos");
        System.out.println("Ingrese dos valores");
        Scanner entrada=new Scanner(System.in);        
        System.out.println("Ingrese el primero");
        int valor1=entrada.nextInt();        
        System.out.println("Ingrese el segundo");
        int valor2=entrada.nextInt();
        int total=valor1+valor2;
        System.out.println("El total es"+total);
        
    }
    
}
