/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Ciudad;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int opciones;
        boolean bandera = true;

        do {
            Enlace enlace = new Enlace();
            System.out.println("Ingrese el nombre de la ciudad: ");
            String nombre = sc.nextLine();
            
            System.out.println("Ingrese la poblacion de la ciudad: ");
            int poblacion = sc.nextInt();
            sc.nextLine();

            Ciudad ciudad = new Ciudad(nombre, poblacion);
            enlace.insertarCiudad(ciudad);
            System.out.println("Desea Ingresar mas elementos digite 1, "
                    + "si no lo desea digite otro numero");
            opciones = sc.nextInt();
            if (opciones == 1) {
                bandera = false;
            }
        } while (bandera);

        //for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
        //System.out.printf("%s", c.obtenerDataCiudad().get(i));
        //             
    }
}
