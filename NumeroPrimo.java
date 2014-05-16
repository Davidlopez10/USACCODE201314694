/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] p) {
        // TODO code application logic here

        int numero = 17;


        if (numero > 0) {
            switch (numero) {
                case 2://esto es para imprimir los numeros que no son impresos en el for
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("2\n" + "3\n");
                    break;
                case 5:
                    System.out.println("2\n" + "3\n" + "5\n");
                    break;
                case 7://en el caso que sea 7 se imprime los primos de 7
                    System.out.println("2\n" + "3\n" + "5\n" + "7\n");
                    break;
                default://en el caso que no sea ninguno de los anteriores entonces se imprime estos numeros
                    System.out.println("2\n" + "3\n" + "5\n" + "7");
                    break;
            }

            for (int i = 1; i <= numero; i++) {
//Aqui se quitan a los numeros que son divisibles entre estos 2, 3, 5, 7
                if ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)) {
                    //System.out.println("no es primo");
                } else if (i > 1) {
//este solo imprime los numeros primos que no tienen divisores
                    //   System.out.println("primo");
                    System.out.println(i);
                }
            }

        } else {//este es para indicar al usuario que no ingrese nuemores negativos
            System.out.println("numero invalido");
        }

    }
}
