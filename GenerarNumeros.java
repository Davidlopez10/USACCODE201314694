/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

/**
 *
 * @author David
 */
public class GenerarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader jk = new BufferedReader(new InputStreamReader(System.in));
        int inicio = 1;
        int fin = 100;
        int delta = fin - inicio;
        int numero = 0;
        int usuario = 1; 
        numero = (int) (delta * Math.random() + inicio);
        //while ((numero < usuario) || (numero > usuario)) 
        System.out.println(numero);
        while(numero!=usuario)
        {
            //nos va hacer la generacion de un numero entre 1 y 100
            
            //Aqui es donde el usuario ingresa el numero 
            //AQUI PODEMOS PONER LA ENTRADA DEL USUARIO
            usuario = Integer.parseInt(jk.readLine());
            //condiciones para que le salga al usuario si ingresa el numero correcto
            //System.out.println(usuario);
            if ((usuario > 0) && (usuario < 100)) {
                if (numero == usuario) {
                    System.out.println("Es el numero correcto");
                } else if (usuario < numero) {

                    System.out.println("El numero es menor");
                } else if (usuario > numero) {

                    System.out.println("El numero es mayor");
                }


            } else {
                System.out.println("Numero invalido");
            }
        }

    }
}
