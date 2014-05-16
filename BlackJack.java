
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        BufferedReader jk = new BufferedReader(new InputStreamReader(System.in));

        int cartas[] = new int[3];
        cartas[0] = 0;
        cartas[1] = 0;
        cartas[2] = 0;
        String simbolo = "[x]";
        int valor = 0;




//para generar los valores de las respectivas cartas
        for (int j = 0; j < 3; j++) {
            //genrando un valor cualquiera
            for (int i = 0; i < 13; i++) {
                valor = (int) (1 + (Math.random() * 13));
                // System.out.println(valor);
            }
            //Guardando los valores en la matriz
            cartas[j] = valor;
        }




        //mostrar las 2 cartas
        for (int i = 0; i < 2; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
        int suma = cartas[0] + cartas[1];

        System.out.println("Desea una carta mas \nsi  \nno");
        String answer = jk.readLine();


        if (answer.equalsIgnoreCase("si")) {
            //mostrar las 3 cartas
            for (int i = 0; i < 3; i++) {
                System.out.print(simbolo);
            }
            System.out.println();
            suma = cartas[0] + cartas[1] + cartas[2];
            System.out.println("carta 1= " + cartas[0] + " carta 2= " + cartas[1] + " carta 3= "
                    + cartas[2] + " el resultado es= " + suma);

        } else if (answer.equalsIgnoreCase("no")) {

            System.out.println("valor de cartas es: " + cartas[0] + " " + cartas[1] + " resultado es " + suma);

        } else {
            System.out.println("carater invalido");
        }


        if (suma == 21) {
            System.out.println("Felicitaciones");
        }

    }
}
