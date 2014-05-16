/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Football {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double velocidad=37,angulo=53.1,tiempo=0,distancia=0;
        double x=(Math.cos(angulo));//angulo en radianes
        double y=(Math.sin(angulo));//angulo en radianes
        if(angulo >0){
           
            
        //me calcula el tiempo con respecto a y
        tiempo=(2*velocidad*y)/(9.8);

        //me calcula la distanccia recorrida en el eje x
        distancia=(velocidad*x)*tiempo;
             
         
        
        }
        System.out.println("Su tiempo es de "+tiempo+"s");
        System.out.println("Su distancia es de "+distancia+"m");
        
        
    }
}
