
package Verificacion;

import java.io.File;

/**
 *
 * @author yk122
 */
public class Verificacion {


    public static void main(String[] args) {
        File directorio = new File("/C:\\Users\\yk122\\OneDrive\\Documents\\UNIVERSIDAD\\JAKELIN\\UNIVERSIDAD\\2021-2\\PRUEBAS DE GESTION Y LA CONFIGURACION\\JENKINS/PRACTICA");
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
    }
}

