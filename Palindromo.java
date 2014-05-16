
import java.io.*;


public class Palindromo {

    public static void main(String[] args) throws IOException {
        
        //System.out.println("ingrese la palabra");
        BufferedReader jk = new BufferedReader(new InputStreamReader(System.in));

       String oracion = " "+jk.readLine();//lee la oracion
       String [] oraseparada=oracion.split(" ");//forma el array con las plabras
        
       String palindromo []=new String[oraseparada.length];//guarda las palabra palindromes
      
       
        String palabra="",palindro="";
        for(int k=1;k<oraseparada.length;k++){//este sierve para sacar la primer palabra
        palabra=oraseparada[k];//se guarda la palabra
           // System.out.println(palabra);
        
        for(int i=palabra.length()-1;i>=0;i--){
            palindro=(String)(palindro+palabra.charAt(i));//se saca la palabra leendo inversamete
        }
           // System.out.println(palindro);
       palindromo[k]=palindro;
       if(oraseparada[k].equalsIgnoreCase(palindromo[k])){//se compara
           System.out.println("Es palindromo");
       } else{
           System.out.println("No es palindromo");
        }
       
       
       palindro="";//sirve para reinicar el palindro
       }
       }
}
