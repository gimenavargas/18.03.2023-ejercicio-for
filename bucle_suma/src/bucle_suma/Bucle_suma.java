/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle_suma;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Bucle_suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Ingresar numero");
        int n = number.nextInt();
        
        int suma = 0; 
        for(int numero = 1; numero <=n; numero ++){
            suma = suma + numero;
        }
        System.out.println("la suma es:"+suma);
    
         }
     }