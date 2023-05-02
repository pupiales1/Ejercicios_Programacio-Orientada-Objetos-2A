
package ec.edu.intsuperior.vista;

import java.util.Scanner;


public class Aplicacion {
    public static void main(String[] args) {
        Numniños_niñas();
    }
    public static void Numniños_niñas(){
        Scanner leer=new Scanner(System.in);
        
        int gen=0,cn=0,cna=0;
        do{
            System.out.println("Ingrese genero (1 niño) (2 niña) (0 finalizar conteo)");
        gen=leer.nextInt();
        
        switch(gen)
        {
            case 1:
                cn++;
                break;
            case 2:
                cna++;
            break;
        }       
        }while (gen!=0);
        
        System.out.println("Los niños son"+  cn);
        System.out.println("Las niñas son"+  cna);
    }
    
    public static void intercambioValores(){
        Scanner leer=new Scanner(System.in);
        
        int num1=35;
        int num2=20;
        int aux;
        
        System.out.println("----Antes----");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        
        aux = num2;
        num2 = num1;
        num1 = aux;
        
        System.out.println("----Despues----");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
    
    public static void Comparacion(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero;
        numero=leer.nextInt();
        if(numero<0){
            System.out.println("Es negativo");
        }
        if(numero>100){
            System.out.println("Es mayor a 100");
            
    }
        if(numero>=0 && numero<=100){
            System.out.println("Esta en el intervalo 0-100");
        }
    }
    
    public static void Vector(){
        Scanner leer=new Scanner(System.in);
        int vector[]=new int[15];
        
        for(int i=0; i<15; i++){
            System.out.println("Ingresa un numero para el vector");
            vector[i] = leer.nextInt();
        }
        int con=0;
        for(int i=0; i<15; i++){
            if(vector[i]==3){
                con=con+1;
            }
            
        }
        System.out.println("La cantidad de numeros 3 que hay en el vector son " + con);
     }
     
    public static void productosPresios (){
        Scanner leer=new Scanner(System.in);
        String utiles []={"pelota", "zapatilla","mochila","polo"};
        
        double precios[]={35.5,89.60,45.99,25.70};
        System.out.println("Lista de Productos y sus precios");
        
        for (int u=0;u<utiles.length;u++){
        System.out.println(utiles[u]+ " "+ precios[u]); 
        
      } 
     
   }
    
}
