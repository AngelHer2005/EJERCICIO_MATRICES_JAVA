
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class Ejercicio_02 {

    public static void main(String[] args) {
        // En este código, mostraremos un array tridimensional que tenga 
        // las 3 torres de SENATI, sus 9 pisos, pues el primero y el onceavo no posee salones,
        // y los 3 salones de cada piso

        // Declaración del array torres.
        boolean[][][] torres = new boolean[3][9][3]; Scanner input = new Scanner(System.in); Random random = new Random();
        // Implementamos los valores.
        for (int torre = 0; torre < 3; torre++) {
            for (int piso = 0; piso < 9; piso++) {
                for (int salon = 0; salon < 3; salon++) {
                    torres[torre][piso][salon] = random.nextBoolean();
                }
            }
        }

        // Imprimir los números de salón de cada torre.
        for (int torre = 0; torre < 3; torre++) {
            System.out.println("torre " + (torre + 1) + ":");
            for (int piso = 0; piso < 9; piso++) {
                for (int salon = 0; salon < 3; salon++) {
                    System.out.print(torres[torre][piso][salon] + " ");
                }
                System.out.println(); // Nueva línea después de cada piso
            }
            System.out.println(); // Línea en blanco entre torres
        }
        Map<Character, Integer> opciones = new HashMap<>();
        opciones.put('a', 1);
        opciones.put('b', 2);
        opciones.put('c', 3);
        int torre, piso, salon; String msj;
        
        System.out.println("\nEste código mostrará que salón está desocupado, elige la torre (A, B o C), el piso (1-9) y la salón (1-3).\nTorre:");
        char opcion = input.next().toLowerCase().charAt(0);
        while(true){
            if (opciones.containsKey(opcion)) {
                torre = opciones.get(opcion);
                break;
        }else{
            System.out.println("Se ingresó un carácter inválido, ingresa de nuevo.\nTorre:");
            opcion = input.next().charAt(0);
            }
        }
        while(true){
            System.out.println("\nPiso:");
            piso = input.nextInt();
            if (piso>9 || piso < 1) {
                System.out.println("Ingresó un valor inválido, inténtelo de nuevo (1-9).");
                piso = input.nextInt();
            }else{
                break;
            }
        }
        while(true){
            System.out.println("\nSalón:");
            salon = input.nextInt();
            if (salon>3 || salon < 1) {
                System.out.println("Ingresó un valor inválido, inténtelo de nuevo (1-9).");
                salon = input.nextInt();
            }else{
                break;
            }
        }
        if (torres[torre-1][piso-1][salon-1]) {
            msj = " está disponible.";
        }else{
            msj = " no está disponible.";
        }
        
        System.out.println("El salón " + salon + ", del piso " + piso + ", de la torre " + torre + msj);

    }
    
}
