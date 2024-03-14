/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class Ejercicio_01 {

    public static void main(String[] args) {
        String[][] personas = {
            {"Nombre", "Edad", "Género"},
            {"Juan", "25", "M"},
            {"Pedro", "35", "M"},
            {"María", "30", "F"}
        };
        System.out.println("-".repeat(30));
        for (int i = 1; i < personas.length; i++) {
            System.out.printf(i + ". Nombre: %s, Edad: %s, Género: %s%n",
                      personas[i][0], personas[i][1], personas[i][2]);
            }  

    }
    
}
