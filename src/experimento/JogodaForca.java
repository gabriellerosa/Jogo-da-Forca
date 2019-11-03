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
        
        //Qnts palavras tem no jogo
        int quantPalavras = palavras.length;        
        //Qual palavra foi sorteada
        int indiceSorteado = random.nextInt(quantPalavras);
        String sorteada = palavras[indiceSorteado];
        
        //controlar os acertos do usuário
        char[] acertos = new char[sorteada.length()];
        for(int i = 0; i < acertos.length; i++){
            acertos[i] = 0;
        }
        //letra atual que a pessoa digitou
        char letra;
        boolean ganhou = false;
        int vidas = sorteada.length();
        
        String letrasUtilizadas = "";
       
        for(int i = 0; i < sorteada.length(); i++){
            System.out.print(" _ ");              
        }
        
        System.out.print("\n");
        
        do{
            System.out.println("\n"
                    + "Voce tem " + vidas + " vidas"
                    + "\nLetras usadas: " + letrasUtilizadas
                    + "\nQual letra vc deseja tentar?");
            
            //Lendo uma letra do teclado e o touppercase é pra colocar essa letra em maiusculo
            letra = in.next().toUpperCase().charAt(0);
            //concatenando as strings 
            letrasUtilizadas += " " + letra;
            
            boolean perdeVida = true;
            //verificar a letra sorteada é igual na pos i
            for(int i = 0; i < sorteada.length(); i++){
                //verificar se a letra digitada é igual a letra da palavra sorteada na pos i
                if(letra == sorteada.charAt(i)){
                    System.out.println("\nTem a letra");
                    acertos[i] = 1;
                    
                    //se o cara acertou alguma vez ele nao perde vida
                    perdeVida = false;
                }
            }
            
            if(perdeVida)
                vidas--;
            
            System.out.print("\n");
            ganhou = true;    
            for(int i = 0; i < sorteada.length(); i++){

                if(acertos[i] == 0){
                    System.out.print(" _ ");
                    ganhou = false;
                }else{
                    System.out.print(" " + sorteada.charAt(i) + " ");
                }
            }
            System.out.print("\n");
        }while(!ganhou && vidas > 0);
        
        if(vidas != 0){
            System.out.print("\nVocê ganhou haha\n");
        }else{
            System.out.print("\nTente denovo\n");
            System.out.print("\nA palavra era " + sorteada);
        }
    }
}
