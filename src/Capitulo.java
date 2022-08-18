import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    // public static String Status(int x){
    // if(x <= 0){
    // return "O jogo acabou voce não tem mais forças para continuar a missão.";
    // }
    // else{
    // int y = 100 - x;
    // String result = "Voce está com "+ Integer.toString(x) + "/100 de saúde e
    // recebeu " + Integer.toString(y) +" de dano.";
    // return result;
    // }
    // }
    // public static int CalCond( int Atual,int Dano) {
    // Atual = Atual - Dano;
    // if( Atual <= 0 ){
    // return -1;
    // }
    // return Atual;
    // }
    String nomedocap;
    String historiaA;
    String historiaA2;
    ArrayList<Escolha> escolhas;
    String escolha;
    String escolha2;
    String escolha3;
    String personagem;
    Scanner okay;
    int estado;
    Capitulo proximo;

    Capitulo(String nomedocap, String historiaA, String escolha,
            String escolha2, String escolha3, String pessoa, Capitulo proximo, Scanner okay) {

        this.nomedocap = nomedocap;
        this.historiaA = historiaA;
        this.escolha = escolha;
        this.escolha2 = escolha2;
        this.escolha3 = escolha3;
        this.personagem = pessoa;
        this.proximo = proximo;
        this.escolhas = new ArrayList<>();
    }

    void imprima(Scanner okay){
        AdicArray(this.escolha);
        AdicArray(this.escolha2);
        AdicArray(this.escolha3);
        System.out.println("    Capitulo - " + this.nomedocap + "\n");
        System.out.println(this.historiaA);
        int Ans = okay.nextInt();
        this.escolhas.get(Ans - 1);
    }

    void AdicArray(String x){
        escolhas.add(Escolha(x,this.proximo));
        }

    Escolha Escolha(String escolha4, Capitulo proximo2) {
        return null;
    }


    }
