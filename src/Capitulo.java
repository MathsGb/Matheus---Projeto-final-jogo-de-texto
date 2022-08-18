import java.util.Scanner;

public class Capitulo {
    String nomedocap;
    String historiaA;
    String historiaA2;
    Escolha[] escolhas;
    Agente personagem;
    Scanner okay;
    static int estado = 100;
    Capitulo proximo;


    Capitulo(String nomedocap, String historiaA, Agente pessoa, Scanner okay, Escolha[] escolhas) {
        this.nomedocap = nomedocap;
        this.historiaA = historiaA;
        this.personagem = pessoa;
        this.escolhas = escolhas;
        
    }

    void imprima(Scanner okay){
        if(estado > 0){
            System.out.print("\n"+ estado + "/100 é sua condição atual");
            System.out.println("\n\n    Capitulo - " + this.nomedocap + "\n");
            System.out.println(this.historiaA);
            int Ans = okay.nextInt();
            if(this.escolhas != null){
                for(Escolha escolha : escolhas){
                    if(escolha.textesc != null && escolha.textesc == this.escolhas[0].textesc){
                        System.out.println(escolhas[Ans - 1].textesc);
                        estado = estado - escolhas[Ans - 1].danodeesc;
                        this.escolhas[0].next.imprima(okay);
                        break;
                    }
                    else if(escolha.textesc != null && escolha.textesc == this.escolhas[1].textesc){
                        System.out.println(escolhas[Ans - 1].textesc);
                        this.escolhas[1].next.imprima(okay);
                        break;
                    }
                    else if(escolha.textesc != null && escolha.textesc == this.escolhas[2].textesc){
                        System.out.println(escolhas[Ans - 1].textesc);
                        
                        this.escolhas[3].next.imprima(okay);
                        break;
                    }
                }
            }
        }
        else{
            System.out.println("Voce não tem força para continuar");
        }
  }
}
