import java.util.Scanner;

public class Capitulo {
    String nomedocap;
    String historiaA;
    String historiaA2;
    Escolha[] escolhas;
    Agente personagem;
    Scanner Scaneador;
    static int estado = 50;
    Capitulo proximo;


    Capitulo(String nomedocap, String historiaA, Agente pessoa, Scanner Scaneador) {
        this.nomedocap = nomedocap;
        this.historiaA = historiaA;
        this.personagem = pessoa;


    }

    void imprima(Scanner Scaneador){
        if(estado > 0 && Scaneador != null){
            System.out.print("\n"+ estado + "/50 é sua condição atual");
            System.out.println("\n - Capitulo - " + this.nomedocap + "\n");
            System.out.println(this.historiaA);
            if(this.escolhas != null){
                int Ans = Scaneador.nextInt();
                System.out.println(escolhas[Ans - 1].textesc);
                estado = estado - escolhas[Ans - 1].danodeesc;
                this.escolhas[Ans - 1].next.imprima(Scaneador);
            }
        }
        else{
            System.out.println("\nNão há mais como continuar.");
        }
  }
}