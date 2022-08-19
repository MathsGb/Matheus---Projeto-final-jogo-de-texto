import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Entrada e explicação
        String Escolha1B = "Eu sou a 1 escolha da parte 2";
        String Escolha2B = "Eu sou a 2 escolha da parte 2";
        // String z = "oi";
        String Historia1A = "Você acorda, ainda exausto você não consegue ignorar o cachorro que não para de lamber "
                +" a ponta do seu pé. A: - É garotão hoje vai ser um dia daqueles."
                +"Atendendo ao chamado como policial investigativo, você é chamado. Ao chegar na cena do crime você e seu parceiro "
                +"Hank, que chegará mais cedo, havia muito do que investigar."
                +"\n-Você pode olhar o corpo da Vítima (1)."
                +"\n-Procurar na casa(2)."
                +"\n-Procurar por Hank(3)";
        
        String Fim1 = "Você acompanha Hank até o hospital, não tendo encontrado nada sobre o assassino, "
                +"você resolve passar o caso para outro Agente."
                +"\n\n        Fim!";
        String Fim2 = "Eu sou o 2 final";
        
        String Historia2A = "Pouco tempo depois Hank se recupera do ocorrido. Ao analisar os dados, vocês descobrem "
                +"que o assassino estava se aproximando da vítima por meio de mensagens e conversar frequentes. "
                +"Não  se sabe ainda por que ele fez isso, mas Hank surge com uma ideia. \nVocês poderiam criar uma"+
                " conta fake e tentar se encontrar com ele(1), já você sugere que tentem rastrear onde ele mora(2).";

        String Escolha1A = "-Alister descobre que ela foi morta com um corte garganta, porém também um corte na barriga "
                +"como se algo tivesse sido tirado. A cena forte deixa Allister desconfortável e enojado com algo tão cruel."
                +"\nVocê perdeu 15 de constituição."
                +"\nLogo após isso você ouve um barulho no andar de cima. Hank estava com o braço cortado com um "
                +"estilete. Ele conta que havia alguém no andar de cima."
                +"\nAlister sente culpa por não estar lá por ele. Você perdeu 10 de constituição.";
        
        String Escolha2A = "Ao procurar pelo andar inferior Alistar encontra o celular da vítima. Relutante você "
                +"utiliza sua digital para destravar e descobre conversar com um sujeito em um site."
                +"\nLogo após isso você ouve um barulho no andar de cima. Hank estava com o braço cortado com um "
                +"estilete. Ele conta que havia alguém no andar de cima."
                +"\nAlister sente culpa por não estar lá por ele. Você perdeu 10 de constituição.";;
        
        String Escolha3A =  "Subindo as escadas, enquanto chama Hank, você vê ele encarando a porta de um quarto "
                +"enquanto te indica pra fazer silêncio. Ao abrir a porta ele é atacado por alguém, você rapidamente "
                +"afasta o desconhecido mas acaba levando um soco no maxilar, enquanto processa o que aconteceu Hank "
                +"consegue imobilizar a pessoa. "
                +"\nVocê perdeu 25 de constituição. "
                +"\nApós isso vocês o interrogam e "
                +"descobrem que ele na verdade erra filho da vítima que estava assustado e que ouviu o que aconteceu "
                +"com sua mãe.";

        System.out.println(
                "Nesse jogo voce deverá escolher agentes antes de iniciar, tenha em mente que cada um deles tem sua própria história com seus pontos fortes e fracos.\n");

        Agente Alister = new Agente("Alister",
                1.90,
                40,
                "Investigação e informação"
                );

        Agente.imprima(Alister);

        Agente Hank = new Agente("Hank",
                1.81,
                38,
                "Combate corpo a corpo e armado");
                
        Agente.imprima(Hank);
        
        Capitulo Final1 = new Capitulo("Final",Fim1,Alister,null, null);
        Capitulo Final2 = new Capitulo("Final",Fim2,Alister,null,null);

        Escolha F = new Escolha(Escolha1B, Final2 ,15);
        Escolha G = new Escolha(Escolha2B, Final2 ,10);

        Escolha[] esc3parte = new Escolha[]{F,G,null};
        Capitulo Extra = new Capitulo("Extra", "oii eu sou uma historia",Alister,entrada,esc3parte);
        Escolha D = new Escolha("Eu sou o texto da 1 alternativa", Extra,0);
        Escolha E = new Escolha("Eu sou o texto da 2 Alternativa", Extra,0);
        Escolha[] esc2parte = new Escolha[]{D,E,null};
        Capitulo VarianteAlis = new Capitulo("Confronto", Historia2A , Alister , entrada, esc2parte);
        Escolha A = new Escolha(Escolha1A, Final1, 25);
        Escolha B = new Escolha(Escolha2A, VarianteAlis,10);
        Escolha C = new Escolha(Escolha3A, VarianteAlis, 25);
        // Escolha G = new Escolha(Escolha3A, VarianteAlis,30);
        System.out.println("Digite o nome daquele que voce vai escolher?");
        String pers = entrada.nextLine();
        pers = pers.toLowerCase();
        
        if (pers.equals("alister")) {
            Escolha[] esc1parte = new Escolha[]{A,B,C};
            Capitulo começo = new Capitulo("Novos horizontes",
                    Historia1A,
                    Alister,
                    entrada,
                    esc1parte);
            começo.imprima(entrada);
        }

        else if (pers.equals("hank")) {
        //     Capitulo começo = new Capitulo("Novos horizontes",
        //             Historia1H,
        //             Hank,
        //             entrada,
        //             null);
        //     começo.imprima(entrada);
        }

        entrada.close();
    }
}
