package ec.edu.espol;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(".Ejercicio 1: Palíndromo.");
        System.out.println("Milenaaaaaaaaaaaaaaa");
        Scanner sc= new Scanner (System.in);
        System.out.println("Ingresa una palabra: ");
        boolean respuesta= esRecursivo(sc.nextLine());
        System.out.println("La palabra es un palíndromo: "+respuesta);
        int cont=0;
        String[] arreglo= {"a","b","c"};
        revertir(arreglo,cont);
        for(String i: arreglo){
            System.out.println(i);
        }
    }

    public static boolean esRecursivo(String n){
        if(n.length()==0 || n.length()==1){
            return true;
        }
        else{
            if(n.substring(0,1).equalsIgnoreCase(n.substring(n.length()-1))){
                return esRecursivo(n.substring(1, n.length()-1));
            }
            return false;
        } 
    }

    public static void revertir (String[] arreglo, int cont){
        if(cont>=arreglo.length/2){
            return;
        }
        else{
            String temp= arreglo[cont];
            arreglo[0+cont]=arreglo[arreglo.length-1-cont];
            arreglo[arreglo.length-1-cont]=temp;
            cont++;
            revertir(arreglo,cont);
        }
    }

    //holaaaaaaaaaaaaaaaa
    
    //Para ver el conflicto
}