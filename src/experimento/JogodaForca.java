package experimento;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author gabrielle
 */
public class JogodaForca {
   
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        //lista de palavras do jogo
        String [] palavras = {"ORTODOXO", "PALAVRA", "AMIGO", "COMPLEXIDADE", "MACARRONADA", "CAVALO"};
        
        //sorteador
        Random random = new Random();
        //tamanho da palavra
        int quantPalavras = palavras.length;        
        //Qual palavra foi sorteada
        int indiceSorteado = random.nextInt(quantPalavras);
        String sorteada = palavras[indiceSorteado];
        
        char[] acertos = new char[sorteada.length()];
        for(int i = 0; i < acertos.length; i++){
            acertos[i] = 0;
        }
        //letra atual que a pessoa digitou
        char letra;
        
        String letrasUtilizadas = "";
       
        while(true){
            System.out.println("\nQual letra vc deseja tentar?");
            letra = in.next().charAt(0);
            //verificar a letra sorteada é igual na pos i
            for(int i = 0; i < sorteada.length(); i++){
                if(letra == sorteada.charAt(i)){
                    System.out.println("\nTem a letra");
                    acertos[i] = 1;
                }
            }

            for(int i = 0; i < sorteada.length(); i++){

                if(acertos[i] == 0)
                    System.out.print(" _ ");
                else
                    System.out.print(" " + sorteada.charAt(i) + " ");
            }

        }
    }
}
