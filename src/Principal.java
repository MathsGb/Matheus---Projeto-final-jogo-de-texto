import java.util.HashMap;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        Leitor Reader = new Leitor();
        HashMap<String, Agente> characters = Reader.lerPerson("rsc/personagens.txt");
        // String Escolha1B = "Eu sou a 1 escolha da parte 2";

        // String Escolha2B = "Eu sou a 2 escolha da parte 2";
        //  String Escolha1A = "-Alister descobre que ela foi morta com um corte garganta, porém também um corte na barriga "
        // +"como se algo tivesse sido tirado. A cena forte deixa Allister desconfortável e enojado com algo tão cruel."
        // +"\nVocê perdeu 15 de constituição."
        // +"\nLogo após isso você ouve um barulho no andar de cima. Hank estava com o braço cortado com um "
        // +"estilete. Ele conta que havia alguém no andar de cima."
        // +"\nAlister sente culpa por não estar lá por ele. Você perdeu 10 de constituição.";
        
        // String Escolha2A = "Ao procurar pelo andar inferior Alistar encontra o celular da vítima. Relutante você "
        // +"utiliza sua digital para destravar e descobre conversar com um sujeito em um site."
        // +"\nLogo após isso você ouve um barulho no andar de cima. Hank estava com o braço cortado com um "
        // +"estilete. Ele conta que havia alguém no andar de cima."
        // +"\nAlister sente culpa por não estar lá por ele. Você perdeu 10 de constituição.";
        
        // String Escolha3A =  "Subindo as escadas, enquanto chama Hank, você vê ele encarando a porta de um quarto "
        // +"enquanto te indica pra fazer silêncio. Ao abrir a porta ele é atacado por alguém, você rapidamente "
        // +"afasta o desconhecido mas acaba levando um soco no maxilar, enquanto processa o que aconteceu Hank "
        // +"consegue imobilizar a pessoa. "
        // +"\nVocê perdeu 25 de constituição. "
        // +"\nApós isso vocês o interrogam e "
        // +"descobrem que ele na verdade erra filho da vítima que estava assustado e que ouviu o que aconteceu "
        // +"com sua mãe.";
        
        // String Fim1 = "Você acompanha Hank até o hospital, não tendo encontrado nada sobre o assassino, "
        // +"você resolve passar o caso para outro Agente."
        // +"\n\n        Fim!";
        
        // String Fim2 = "Eu sou o 2 final";
        

        System.out.println("Nesse jogo voce deverá escolher agentes antes de iniciar, tenha em mente que cada um deles tem sua própria história com seus pontos fortes e fracos.\n");

        // Criação do personagem
        Agente Alister = characters.get("Alister");
        Agente.imprima(Alister);
        
        Agente Hank = characters.get("Hank");
        Agente.imprima(Hank);
        
        HashMap<String, Capitulo> Lore = Reader.lerCap("rsc/historia.txt",Alister, entrada);
        
        // Criação de cada capítulo da história de ambos
        Capitulo começo1 = Lore.get("Novos horizontes");
        // Capitulo Preparacao = Lore.get("Preparacao");
        // Capitulo Confronto = Lore.get("Confronto");
        // Capitulo Final1 = Lore.get("Final 1");
        // Capitulo Final2 = Lore.get("Final 2");
        // Capitulo começo2 = new Capitulo("Novos horizontes","oii eu sou a história de hank",Hank,entrada);
        // Capitulo VarianteHank = new Capitulo("Confronto","Hank e o assassino estão lutando.", Hank, entrada);
        // Capitulo Confronto2 = new Capitulo("","Hanke e o asssanio estão lutando.", Hank, entrada);
        // Capitulo Final3 = new Capitulo("Fim","", Hank, entrada);
        // Capitulo Final4 = new Capitulo("Fim","", Hank, entrada);

        // Criando escolhas que entrarão no capítulo
        // Escolha A = new Escolha(Escolha1A, Final1, 25);
        // Escolha B = new Escolha(Escolha2A, Preparacao,10);
        // Escolha C = new Escolha(Escolha3A, Preparacao, 25);
        // Escolha[] esc1parte = new Escolha[]{A,B,C}; //Adicionando essa escolhas em um Array de 3 elementos no máximo
        // começo1.escolhas = esc1parte;

        // Escolha D = new Escolha("Eu sou o texto da 1 alternativa", Confronto,0);
        // Escolha E = new Escolha("Eu sou o texto da 2 Alternativa", Confronto,0);
        // Escolha[] esc2parte = new Escolha[]{D,E,null};
        // Preparacao.escolhas = esc2parte;

        // Escolha F = new Escolha(Escolha1B, Final2 ,15);
        // Escolha G = new Escolha(Escolha2B, Final2 ,10);
        // Escolha[] esc3parte = new Escolha[]{F,G,null};
        // Confronto.escolhas = esc3parte;

        // Escolha Um = new Escolha("",VarianteHank, 20);
        // Escolha Dois = new Escolha("",VarianteHank, 20);
        // Escolha Tres = new Escolha("",VarianteHank, 20);
        // Escolha[] esc4parte = new Escolha[]{Um,Dois,Tres};
        // começo2.escolhas = esc4parte;

        // Escolha Quatro = new Escolha("",VarianteHank, 20);
        // Escolha Cinco = new Escolha("",VarianteHank, 20);
        // Escolha Seis = new Escolha("",VarianteHank, 20);
        // Escolha[] esc5parte = new Escolha[]{Quatro,Cinco,Seis};
        // VarianteHank.escolhas = esc5parte;

        // Escolha Sete = new Escolha("",Final4, 20);
        // Escolha Oito = new Escolha("",Final3, 20);
        // Escolha Nove = new Escolha("",Final3, 20);
        // Escolha[] esc6parte = new Escolha[]{Sete,Oito,Nove};
        // Confronto2.escolhas = esc6parte;

        System.out.println("Digite o nome daquele que voce vai escolher?");
        String pers = entrada.nextLine();
        pers = pers.toLowerCase();

        // inicio da história
        if (pers.equals("alister")) {
            começo1.imprima(entrada);
        }
        // else if (pers.equals("hank")) {
        //     começo2.imprima(entrada);
        // }

        entrada.close();
    }
}
