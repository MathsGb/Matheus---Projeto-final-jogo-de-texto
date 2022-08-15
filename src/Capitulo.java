import java.util.Scanner;
public class Capitulo {
    String nomedocap;
    String historiaA1;
    String historiaA2;
    String escolha;
    String escolha2;
    String escolha3;
    String personagem;
    Scanner okay;
    
    Capitulo(String nomedocap, String historiaA1 , String historiaA2, String escolha,
    String escolha2, String escolha3, String personagem, Scanner okay){
        this.nomedocap = nomedocap;
        this.historiaA1 = historiaA1;
        this.historiaA2 = historiaA2;
        this.escolha = escolha;
        this.escolha2 = escolha2;
        this.escolha3 = escolha3;
        this.okay = okay;
        this.personagem = personagem;
        
    }
    void imprima(String pessoa, Scanner okay){
        System.out.println("    Capitulo 1 - "+this.nomedocap + "\n");
        System.out.println(this.historiaA1);
        Escolha(pessoa);
        

    }
    void Escolha(String pessoa){
        pessoa = pessoa.toLowerCase();
        Scanner pausa = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        if(pessoa.equals("alister")){
            System.out.println("-Olhar o CORPO mais atentamente\n-Vanculhar a CASA \n-Procurar HANK\n");
            String per1 = entrada.nextLine();
            per1 = per1.toLowerCase();
            if(per1.equals("corpo") || per1.equals("casa")){
                if(per1.equals("corpo")){
                System.out.println(escolha);
                System.out.println(historiaA2);
                System.out.println("\n                    Fim do Capitulo 1");
            }
            else if(per1.equals("casa")){
                System.out.println(escolha2);
                System.out.println(historiaA2);
                System.out.println("\n                    Fim do Capitulo 1");
            }
            else if(per1.equals("hank")){
                System.out.println(escolha3);
                System.out.println(historiaA2);
                System.out.println("\n                    Fim do Capitulo 1");
            }
        }
        else if(pessoa.equals("hank")) {
            System.out.print("\nPressione Enter para continuar....\n");
            String pausa3 = okay.nextLine();
            pausa3.equals("\n");
            System.out.println(historiaA1);
    }
        pausa.close();
        entrada.close();
}
}
}

