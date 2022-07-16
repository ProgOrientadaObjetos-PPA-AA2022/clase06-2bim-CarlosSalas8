/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author SALA I
 */
public class Principal2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opciones;
        boolean bandera = true;

        do {
            System.out.println("Ingrese el numero de la placa: ");
            String nplaca = sc.nextLine();

            System.out.println("Ingrese el valor de la placa: ");
            double vplaca = sc.nextDouble();
            sc.nextLine();

            Enlace enlace = new Enlace();
            Auto a = new Auto();
            a.establecerPlaca(nplaca);
            a.establecerValorMatricula(vplaca);

            enlace.insertarAuto(a);

            System.out.println("Desea Ingresar mas elementos digite 1, "
                    + "si no lo desea digite otro numero");
            opciones = sc.nextInt();
            if (opciones == 1) {
                bandera = false;
            }
        } while (bandera);
    }
}
