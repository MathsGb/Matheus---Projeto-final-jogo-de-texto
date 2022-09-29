import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Capitulo {
    private String nomedocap;
    private String historia;
    private ArrayList<Escolha> escolhas;
    Agente personagem;
    Scanner Scaneador;
    private static int estado = 50;
    Capitulo proximo;

    public Capitulo(String nomedocap, String historiaA, Agente pessoa, Scanner Scaneador) {
        this.nomedocap = nomedocap;
        this.historia = historiaA;
        this.personagem = pessoa;
        this.escolhas = new ArrayList<Escolha>();
    }
    
    public Capitulo(Agente person,
                    Scanner informação,
                    HashMap<String, Capitulo> historia2,
                    Scanner scannerLeitor)
    {
        this.LerCapitulos(person, informação, scannerLeitor);
        this.escolhas = new ArrayList<Escolha>();
    }

    public void imprima(Scanner Scaneador){
        if(estado > 0 && Scaneador != null){
            System.out.print("\n"+ estado + "/50 é sua condição atual");
            System.out.println("\n - Capitulo - " + this.nomedocap + "\n");
            System.out.println(this.historia);
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

    private void LerCapitulos(Agente person,
                            Scanner informação,
                            Scanner scannerLeitor)
        {
        String linha;
        linha = scannerLeitor.nextLine(); 
        this.nomedocap = scannerLeitor.nextLine(); //Título do Capitulo
        linha = scannerLeitor.nextLine();
        this.historia = scannerLeitor.nextLine(); //História inerente
        }

    public void adicionaEscolha(Escolha escolha)
    {
        this.escolhas.add(escolha);
    }

    public String getNome() {
        return this.nomedocap;
    }
}