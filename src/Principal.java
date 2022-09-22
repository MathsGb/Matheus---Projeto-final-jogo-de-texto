import java.util.HashMap;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        Leitor Reader = new Leitor();
        HashMap<String, Agente> characters = Reader.lerPerson("rsc/personagens.txt");

        System.out.println("Nesse jogo voce deverá escolher agentes antes de iniciar, tenha "
        +" em mente que cada um deles tem sua própria história com seus pontos fortes e fracos.\n");
        
        // Criação do personagem
        Agente Alister = characters.get("Alister");
        Agente.imprima(Alister);
        Agente Hank = characters.get("Hank");
        Agente.imprima(Hank);

        HashMap<String, Capitulo> Lore = Reader.lerCap("rsc/historia.txt",Alister, entrada);

        // Criação de cada capítulo da história de ambos
        Capitulo começo1 = Lore.get("Novos horizontes");
        Capitulo começo2 = Lore.get("Introdução");
        
        System.out.println("Digite o nome daquele que voce vai escolher?");
        String pers = entrada.nextLine();
        pers = pers.toLowerCase();

        // Inicio da história
        if (pers.equals("alister")){
            começo1.imprima(entrada);
        }
        else if (pers.equals("hank")){
            começo2.imprima(entrada);
        }

        entrada.close();
    }
}