package MeusJogosCriadosEmJAVA;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int palpite;
        int tentativas = 0;
        boolean acertou = false;

        
        System.out.println("Seja Bem Vindo ao Jogo da Advinhação"
        +"\n Clique em S para Continuar"
        +"\n Caso queira sair digite N");
        char jogar = in.next().charAt(0);

        if(jogar == 'S' || jogar == 's'){
           System.out.println("Ok, Você Clicou em Continuar");

           System.out.println("Estou pensando em um número entre 1 e 100. Tente adivinhar!");

        
           while(acertou){
             System.out.println("Digite um Número");
             palpite = Integer.parseInt(in.nextLine());
             tentativas++;

            if(palpite == numeroAleatorio){
                acertou = true;
             System.out.println("Parabéns!! Você acertou o número em " + tentativas + " tentativa(s)!");
            } else if(palpite < numeroAleatorio){
                System.out.println("O número é maior!! Tente novamente.");
            }else{
                System.out.println("O número é menor!! Tente novamente.");
            }
       }
        }else{
           System.out.println("Desxonectou do Jogo.... ");
        }
    }
}
