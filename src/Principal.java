
import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner pausa = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);

        // Entrada e explicação
        System.out.println("Nesse jogo voce deverá escolher agentes antes de iniciar, tenha em mente que cada um deles \ntem sua  própria história com seus pontos fortes e fracos.");
        System.out.print("Pressione Enter para continuar....");
        String pausa1 = pausa.nextLine();
        pausa1.equals("\n");
        Agente Alister = new Agente("Alister",
                                    1.90,
                                    40,
                                    "Investigação e informação");
        System.out.println("Agente 1: \n Nome: " + Alister.nome);
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
        System.out.println("\nDiga o nome daquele que voce vai escolher?");
        String pers = entrada.nextLine();
        pers = pers.toLowerCase();
        if (pers.equals("alister")){
            int estado = 100;
            System.out.println("\n-------------- Capítulo 1 --------------\n");
            System.out.println("   Depois de uma péssima noite de sono, acordar com um cachorro na sua cara é de certa forma reconfortante se não hilário.\n- *** obrigado por me acordar bonitinho, mas sério, bem que podia deixar dormir mais 1 horinha seria incrível.-\n\nLogo após isso o Shiba "+
                                " começa a lamber voce fréneticamente, os pelos branco começam a sair  do cachorro com todo\no movimento da cauda, voce até impediria se não fosse tão fofo.");
            System.out.println("\n -Tá bom, tá bom já chega, assim voce joga sujo e eu tenho que sair lembra?. mas não se preucupa eu trago"+
                                " algo pra voce mais tarde.-  Indo até o banheiro voce olha o espelho, a barba está um mesclado do preto e grisalho mas ainda não "+
                                "tá na hora de aparar,mas se bem que pelo corpo talvez esteja na hora, de qualquer forma preciso de um banho. \n ");
            System.out.print("Pressione Enter para continuar....");
            String pausa2 = pausa.nextLine();
            System.out.println("\n Agora já depois de ter trocado de roupa voce sente a sua barriga roncando,acaba lembrando da cafeteria do final da rua, só de pensar no fraphucchino o roncar retorna fortemente."+
                                "\n - *** eu já vou indo, deixei a commida pro dia e é provável que eu só volte tarde, então não adianda ficar na porta esperando-  Ele dá um giro e se agacha com vontade de brincar -"+
                                " Mais tarde tá bom.-  Responde fazendo carinho na barriga dele. \n\n Ao chegar na cafeteria voce para o carro no estacionamento ");

        }   
        else if(pers == "barney"){

        }
        else{
            System.out.println("Entrada inválida por favor recomece ");
        }
        System.out.println("Obrigado por jogar!");

        entrada.close();
        pausa.close();
    }
}