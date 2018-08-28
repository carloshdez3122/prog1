package operaciones;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
       
        int x = 0;
        int y = 0;
        
        System.out.print("Ingrese un numero: \n>> ");
        Scanner dato1 = new Scanner (System.in);
        x = dato1.nextInt();
        
        System.out.print("Ingrese otro numero: \n>> ");
        Scanner dato2 = new Scanner (System.in);
        y = dato2.nextInt();
        
        int resultado = x + y;
        
        
        System.out.println("El resultado de la suma es: \n" + resultado);
        
        
        
        
    }
    
}