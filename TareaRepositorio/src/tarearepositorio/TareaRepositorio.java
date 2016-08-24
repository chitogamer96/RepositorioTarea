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
        System.out.println("INGRESE LA CANTIDAD DE HORAS TRABAJADAS");
        Scanner entrada =new Scanner(System.in);
        int horas=entrada.nextInt();
        Calculo calculo=new Calculo();
        int total=calculo.CalcularHoras(horas);
        System.out.println("El valor total por las "+horas+"trabajadas es de "+total);
    }
    
}
