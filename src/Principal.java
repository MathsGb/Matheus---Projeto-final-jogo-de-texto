import java.util.Scanner;
public class Principal{
    public static String Status(int x){
        if(x == 1){
            return "O jogo acabou voce não tem mais determinação de continuar a missão.";
        }
        else{
            String result = "Voce está com "+ Integer.toString(x) + "/100 ";
        return result;
        }
    }
    
    public static int CalCond( int Atual,int Dano) {
        Atual = Atual - Dano;
        if( Atual <= 0 ){
            return -1;
        }
        return Atual;
    }
    public static void main(String[] args){
        Scanner pausa = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);

        // Entrada e explicação
        System.out.println("Nesse jogo voce deverá escolher agentes antes de iniciar, tenha em mente que cada um deles tem sua própria história com seus pontos fortes e fracos.\n");
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
                                    1.81,
                                    38,
                                    "Combate corpo a corpo e armado");
        System.out.println("\n\nAgente 2: \n Nome: " + Barney.nome);
        System.out.println(" "+ Barney.altura +" m de altura");
        System.out.println(" "+ Barney.idade +" anos de idade");
        System.out.println(" É especialista em " + Barney.especialidade);

        //Início da história
        System.out.println("\nDiga o nome daquele que voce vai escolher?");
        String pers = entrada.nextLine();
        pers = pers.toLowerCase();
        if (pers.equals("alister")){
            int estado = 100;
            System.out.println("\n-------------- Capítulo 1 --------------\n");
            System.out.println(Status(CalCond(estado,0)));
            System.out.println("\n   Depois de uma péssima noite de sono, acordar com um cachorro na sua cara é de certa forma reconfortante se não hilário.\n- Oo Pingu, obrigado por me acordar bonitinho, mas sério, bem que podia deixar dormir mais 1 horinha seria incrível.-   Logo após isso o Shiba "+
                                " começa a lamber voce fréneticamente, os pelos branco começam a sair do\n cachorro com todo o movimento da cauda, voce até impediria se não fosse tão fofo.");
            System.out.println("\n -Tá bom, tá bom já chega, assim voce joga sujo e eu tenho que sair lembra?. mas não se preucupa eu trago"+
                                " algo pra voce mais tarde.-  Indo até o banheiro voce olha o espelho, a barba está um mesclado do preto e grisalho mas ainda não "+
                                "tá na hora de aparar,mas se bem que pelo corpo talvez esteja na hora, de qualquer forma preciso de um banho. \n ");
            System.out.print("Pressione Enter para continuar....");
            String pausa2 = pausa.nextLine();
            System.out.println("\n Agora já depois de ter trocado de roupa voce sente a sua barriga roncando,acaba lembrando da cafeteria do final da rua, só de pensar no fraphucchino o roncar retorna fortemente."+
                                "\n - Pingu eu já vou indo, deixei a comida pro dia e é provável que eu só volte tarde, então não adianda ficar na porta esperando-  Ele dá um giro e se agacha com vontade de brincar -"+
                                " Mais tarde tá bom.-  Responde fazendo carinho na barriga dele. \n\n Ao chegar na cafeteria voce para o carro no estacionamento, O ar do ambiente chega é aconchegante mesmo sendo tão cedo"+
                                " pela manhã, voce faz o pedido e fica senta perto da janela aberta com o sol fraco entando, enquanto pensa no próprio cansaço, durante esse momento voce vê Barney passando de na calçada"+
                                " enquanto estava caminhando. \n\n -Bom dia Barney, me surpreende a sua disposição pra caminhar a essa hora, Quer se juntar a mim?-"+
                                "\nEle pensa um pouco antes de falar, ainda ofegante depois de toda corrida. -...Quer saber, porque não? - Diz enquanto enxuga o suor com uma toalha de carregava em direção a entrada. Agora,"+
                                " já sentado, ele cumprimenta melhor enquanto pede um cappuchino pra si. \n B: -Serio que a minha caminhada é o 'incomum' toda semana voce tomacafé da manhã em um lugar diferente. \n A: -Se chama "+
                                "experimentar, odeio comer a mesma coisa sempre, com  a nossa idade é dificil encontrar algo novo comendo o de sempre-  Diz enquanto dá uma risadinha e batendo na barriga.  -E voce porque tá correndo agora,"+
                                " sei que é meio que seu hobby mas parece um pouco cedo não acha? \n\n          WIP");

        }   
        else if(pers.equals("barney")){
            System.out.println("\n-------------- Capítulo 1 --------------\n");
            System.out.println(Status(CalCond(100,0)));
            System.out.println("\n   Acordar abruptamente sempre foi um saco, como um bebe no útero que é jogado no mundo exterior, voce pensa no cansaço do corpo em como dormir num banco depois de caminhar foi uma péssima ideia, "+
            "infelizmente nada é melhor pra esvaziar a mente e é exatamente o que eu tô precisando agora. Após um boa esticada é melhor voltar a correria.\n\n Mas antes não sabe qual caminho tomar, se quer passar pelo CENTRO ou volta pro PARQUE?");
            String perg = entrada.nextLine();
            perg = perg.toLowerCase();
            if(perg.equals("centro")){
                System.out.println("\n                WIP   ");

            }
            else{
                System.out.println("Voce volta pra casa e deixa as preucupaçoes no subconsciente.");
            }

        }
        else{
            System.out.println("Entrada inválida por favor recomece ");
        }
        System.out.println("\nObrigado por jogar!");
        
        entrada.close();
        pausa.close();
    }
}