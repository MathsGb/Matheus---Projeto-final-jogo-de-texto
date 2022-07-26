import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner pausa = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);

        // Entrada e explicação
        System.out.println("Nesse jogo voce deverá escolher agentes antes de iniciar, tenha em mente que cada um deles \ntem sua  própria história com seus pontos fortes e fracos.");
        String pausa1 = pausa.nextLine();
        Agente Alister = new Agente("Alister",
                                    1.90,
                                    40,
                                    "Investigação e informação");
        System.out.println("Agente 1: \n Nome: " +Alister.nome);
        System.out.println(" "+Alister.altura+" m de altura");
        System.out.println(" "+Alister.idade+" anos de idade");
        System.out.println(" É especialista em " + Alister.especialidade);

        Agente Barney = new Agente("Barney",
                                    1.79,
                                    38,
                                    "Combate corpo a corpo e armado");
        System.out.println("\n\nAgente 2: \n Nome: " + Barney.nome);
        System.out.println(" "+ Barney.altura +" m de altura");
        System.out.println(" "+ Barney.idade +" anos de idade");
        System.out.println(" É especialista em " + Barney.especialidade);
        //System.out.println(Condição.CalCond(100,25,1) + " e " +Condição.CalCond(100,100,2));

        //Início da história 

        System.out.println("\nQual deles voce vai escolher?\n");
        String pers = entrada.nextLine();
        System.out.println("\n-------------- Capítulo 1 --------------");
        if( pers.toLowerCase() == "alister"){
            System.out.println();
        }
        else if(pers.toLowerCase() == "barney"){
            
        }
        System.out.println("Obrigado por jogar!");
    entrada.close();
    pausa.close();
    }
}