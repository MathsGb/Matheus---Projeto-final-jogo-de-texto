import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    private String nomedocap;
    private String historiaA;
    private ArrayList<Escolha> escolhas;
    Agente personagem;
    Scanner Scaneador;
    private static int estado = 50;
    Capitulo proximo;


    public Capitulo(String nomedocap, String historiaA, Agente pessoa, Scanner Scaneador) {
        this.nomedocap = nomedocap;
        this.historiaA = historiaA;
        this.personagem = pessoa;
        this.escolhas = new ArrayList<Escolha>();

    }
    
    public void imprima(Scanner Scaneador){
        if(estado > 0 && Scaneador != null){
            System.out.print("\n"+ estado + "/50 é sua condição atual");
            System.out.println("\n - Capitulo - " + this.nomedocap + "\n");
            System.out.println(this.historiaA);
            if(this.escolhas.size() != 0){
                int Ans = Scaneador.nextInt();
                System.out.println(escolhas.get(Ans - 1).getTextEsc());
                estado = estado - escolhas.get(Ans - 1).getDanodeEscolha();
                this.escolhas.get(Ans - 1).getNext().imprima(Scaneador);
            }
        }
        else{
            System.out.println("\nNão há mais como continuar.");
        }
    }
    


    public void adicionaEscolha(Escolha escolha)
    {
        this.escolhas.add(escolha);
    }
}