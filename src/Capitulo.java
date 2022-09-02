import java.util.Scanner;

public class Capitulo {
    String nomedocap;
    String historiaA;
    String historiaA2;
    Escolha[] escolhas;
    Agente personagem;
    Scanner okay;
    static int estado = 50;
    Capitulo proximo;


    Capitulo(String nomedocap, String historiaA, Agente pessoa, Scanner okay) {
        this.nomedocap = nomedocap;
        this.historiaA = historiaA;
        this.personagem = pessoa;


    }

    void imprima(Scanner okay){
        if(estado > 0 && okay != null){
            System.out.print("\n"+ estado + "/50 é sua condição atual");
            System.out.println("\n - Capitulo - " + this.nomedocap + "\n");
            System.out.println(this.historiaA);
            if(this.escolhas != null){
                int Ans = okay.nextInt();
                System.out.println(escolhas[Ans - 1].textesc);
                estado = estado - escolhas[Ans - 1].danodeesc;
                this.escolhas[Ans - 1].next.imprima(okay);
            }
        }
        else{
            System.out.println("\nNão há mais como continuar.");
        }
  }
}