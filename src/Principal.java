import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Entrada e explicação

        String Historia1A = "\n\nDepois de uma péssima noite de sono, acordar com um cachorro na sua cara é de certa forma reconfortante se não hilário."
                + "\n\n- O Pingu, obrigado por me acordar bonitinho, mas sério, bem que podia deixar dormir mais 1 horinha seria incrível.-"
                + "Logo após isso o Shiba começa a lamber voce fréneticamente, os pelos branco começam a sair do cachorro com todo o movimento da cauda, voce até impediria se não fosse tão fofo."
                + "\n\n-Tá bom, tá bom já chega, assim voce joga sujo e eu tenho que sair lembra?. mas não se preucupa eu trago algo pra voce mais tarde.-"
                + "Indo até o banheiro voce olha o espelho, a barba está um mesclado do preto e grisalho mas ainda não tá na hora de aparar,mas se bem que pelo corpo talvez esteja na hora,"
                + "de qualquer forma preciso de um banho."
                + "\n\nAgora já depois de ter trocado de roupa voce sente a sua barriga roncando,acaba lembrando da cafeteria do final da rua, só de pensar no fraphucchino o roncar retorna fortemente."
                + "- Pingu eu já vou indo, deixei a comida pro dia e é provável que eu só volte tarde, então não adianda ficar na porta esperando- "
                + " Ele dá um giro e se agacha com vontade de brincar -Mais tarde tá bom.-Responde fazendo carinho na barriga dele."
                + "Ao chegar na cafeteria voce para o carro no estacionamento, O ar do ambiente chega é aconchegante "
                + "mesmo sendo tão cedo pela manhã,voce faz o pedido e fica senta perto da janela aberta com o sol fraco entrando, enquanto pensa no próprio cansaço, durante esse momento voce vê Hank passando de na calçada  estava caminhando."
                + " \n\nA: -Bom dia Hank, me surpreende a sua disposição pra caminhar a essa hora, Quer se juntar a mim?-Ele pensa um pouco antes de falar, ainda ofegante depois de toda corrida. -...Quer saber, porque não? -Diz enquanto enxuga o suor"
                + "com uma toalha de carregava em direção a entrada. Agora,já sentado, ele cumprimenta melhor enquanto pede um cappuchino pra si. \n\nH: -Serio que a minha caminhada é o 'incomum' toda semana voce toma café da manhã em um lugar diferente."
                + "\n\nA: -Se chama experimentar, odeio comer a mesma coisa sempre, com  a nossa idade é dificil encontrar algo novo comendo o de sempre-  Diz enquanto dá uma risadinha e batendo na barriga.  -E voce porque tá correndo agora, sei que "
                + " é meio que seu hobby mas parece um pouco cedo não acha? Temos tempo até irmos pra o trabalho.\n\n-H: -Voce mais do que nínguem deveria ter uma válvula de escape depois de tudo o que a gente vê no trabalho, o  meu só é simples e bem"
                + " pro corpo. \n\nA: -Eu tenho um cachorro, ele... ajuda a lidar com tudo, mas oia nosso pedido já tá vindo.- Depois de comer voce recebe uma ligação do da policia local a respeito de um caso "
                + "de assassinato no subúrbio da cidade. " + "- Hank vamos, tem um novo caso descendo até o subúbio."
                + "\nAo chegar na cena voce observa a casa, por fora está muito precária com partes dela caindo e o jardim da frente muito grande, como se não fosse cuidado a semanas. voce se"
                + "aproxima dos policiais que guardam a cena enquanto Hank já entra de cara:"
                + "\n\nA: -Com liçensa, eu e meu amigo somos do setor de investigação, sei que é meio óbvio, mas tem algum traço do assassino?"
                + "\n\nP: -Até agora não encontramos nada, na verdade recebemos um chamado só a alguma horas, e como essa parte da cidade é menos vigiada só enviaram nós dois e quando chegamos"
                + "já encontramos o corpo dela assim."
                + "\n\nVoce agora entrando na casa, observa a vítima, uma mulher caída no chão da sala com a barriga para baixo, ela tem uma corte no pescoço e está com o abdomém todo ensanguentado"
                + "não consegue olhar pra ela e não sentir o desconforto do lugar e a dor que essa pessoa deve ter sentido. Ao dar uma olhada no interior casa tudo parece ser normal, nada que"
                + "aparente estranho ou fora do comum. Oque vai fazer?"
                + "\n\n-Olhar o CORPO(1) mais atentamente\n-Vanculhar a Casa(2) \n-Procurar Hank(3)";
        String Historia1B = "De repente voce escuta um barulho vindo de cima das escadas.... correndo até lá voce vê Hank caído no chão de um quarto com um corte no braço."
                + "\n\nA: -Que merda aconteceu?"
                + "\n\nH: -A porra do cara me ferrou com um estilete... o merdinha saiu pela janela."
                + "\n\nA: -Que 'merdinha'? tinha mais alguém aqui?"
                + "\n\nH: -Um garoto sei lá, meio jovem talvez 17 ou 19... Ahaa merda ... Acho que ainda dá pra ir atrás."
                + "\n\nA: -Deixa a essa hora pode estar em qualquer lugar, ainda mais na periferia que é mais facil se esconder, deixa que eu cuido desse braço.- "
                + "Voce enfaixa o braço dele enquanto sai da casa relatando o que aconteceu e contando pra hank o que voce encontrou dentro do carro.";
        String Escolha1A = "Voce se abaixa um pouco próximo ao corpo, mesmo estando em sua casa ela parece estar muito bem arrumada, algo como uma saia e "
                + "decote combinado quase como se fosse um vestido e calçando um salto curto, voce observa as feridas e o sangue derramado no chão, percebe-se que mesmo com o corte no pescoço ela"
                + "tem batante sangue na barriga, voce vira o corpo dela com um sentimento de desconforto e culpa e levanta a blusa, e olha...  ela tem uma abertura Batante superficial na barriga "
                + "algo que parece come se fosse cortado apenas a derme da pele. Depois voce se levanta com um gosto ruim na boca e um sentimento de nojo.";
        String Escolha2A = "Voce olha em volta a procura algo que pareça útil... ,até que voce avista um telefone com uma capa rosa na bancada estilo americano da cozinha,"
                + "ao pegar e tentar destravar, ele tem a foto da mulher porém está bloqueado com um padrão, atrás dele tinha o leitor de impressão que ainda pode funcionar. Indo em direção ao "
                + "corpo voce coloca o dedo dela para destravar.";
        String Escolha3A = "\nVoce busca por ele aqui pela parte de baixo da casa enquanto chama. - Haaank!!- Ao se aproximar da escada voce escuta ele responder."
                + "\n\nH: -Aqui em cima... eu acho que achei algo!-\n\n"
                + "A: -Como assim algo?-Diz voce enquanto sobe as escadas.-\n\n"
                + "H: -Sei lá eu tava tava olhando e escutei algo vindo dessa parte, parece ser um quarto normal.-\n\n"
                + "A: -Cuidado! os caras lá em baixo falaram que a casa não foi revistad.......- Antes que voce consiga terminar, um jovem , meio abalado sai de trás da porta,"
                + " empunhando um estilete na mão ele avança em direção ao seu parceiro com a lamina em punho, hank consegue mitigar um pouco a batida antes mesmo de ser apunhalado, voce corre e da "
                + "um chute no jovem pra ele cair, mesmo sendo com sua idade ele é bastante forte e comnsegue que recuperar, voce se abaixa e segura-lhe os punhos pra incapacitar qualquer ação, porém "
                + "ele com uma maior agilidade, consegue se soltar e ficar por cima e empunhando a arma, voce mal consegue aguentar ... até que hank dá um mata-leão e o incapacita o bastante até"
                + " amarra-lo. \n\nA: Quem que porra é voce? quer saber vamos perguntar tudo depois, levem ele.";
        String Historia2A = "\n\nAcordar abruptamente sempre foi um saco... assim como"
                + "um bebê no útero que é jogado no mundo frio e claro, voce pensa no cansaço do"
                +"corpo em como dormir num banco de praça depois de caminhar foi uma péssima"
                +"ideia, infelizmente nada é melhor pra esvaziar a mente e é exatamente o que"
                +"eu tô precisando agora. Após um boa esticada é melhor voltar a correria.Com"
                +"um bossejo bem grande voce volta ao pique da corrida, acho que não"
                +"consigo pensar numa forma melhor de começar a manhã, sinto o meu corpo"
                +"fervendo desde cedo e isso me ajuda a"+"ficar cada vez mais alerta no trabalho."
                +"Agora passando pelo final do parque voce consegue ver que a"
                +"população de idosos realmente gosta de acordar cedo, Imaginando se ainda vai"
                +"ser tão ativo quando chegar na idade deles,"+"Nossa eu penso isso mesmo tendo"
                +"só 38, o Al está realmente entrando na minha cabeça ...que horror. Depois de"
                +"passar por algumas pessoa e sair do parque voce sobe a rua, o centro"
                +"sempre tava chegando lojas novas e não tem porque não dar uma olhada."
                +"\nA medida que voce vai olhando nota que não tem tanta novidade"
                +"assim, até que voce encontra uma cara amiga...\n"
                +"\nA: -Bom dia Hank, me surpreende a sua disposição pra caminhar a essa hora, Quer se juntar a mim?-"
                +"\n\nVoce olha pra ele, Alister sempre foi amigável e sinceramente parece alguem muito legal, e mesmmo trabalhando com ele a um tempo eu não diria que somos tão proximos assim, mas "
                +"sendo sincero eu até que estou com fome. Depois de recobrar o folego voce fala.\n\n"
                +"H: -...Quer saber, porque não? -"
                +"\n\nDiz enquanto enxuga o suor com uma toalha de carregava em "
                +"direção a entrada. Sentando na mesa voce lembra de uma bebida que ele costumava falar... "
                +"Cappuchino? Acho que sim, voce pede pra provar enquanto se acomoda na mesa."
                +"\n\nH: -Serio que a minha caminhada é o 'incomum' toda semana voce toma café da manhã em um lugar diferente."
                +"\n\nA: -Se chama experimentar, odeio comer a mesma coisa sempre, com a nossa idade é dificil encontrar algo novo comendo o de sempre-"
                + "Diz enquanto dá uma risadinha e batendo na barriga. -E voce porque tá correndo agora, sei que é meio que seu hobby mas parece um pouco cedo não acha? Temos "
                +"tempo até irmos pra o trabalho.-\n\n"
                +"H: -Voce mais do que nínguem deveria ter uma válvula de escape depois de tudo o que a gente vê no trabalho, o meu só é"
                +"simples e bem pro corpo.-\n\n"+"A: -Eu tenho um cachorro, ele... ajuda a"
                +"lidar com tudo, mas oia nosso pedido já tá vindo.- Depois de comer voce"
                +"recebe uma ligação do da policia local a respeito de um caso"
                +"de assassinato no subúrbio da cidade. - Hank vamos, tem um novo caso descendo até o subúbio.\n\n"
                +"Nossa que novidade que está acontecendo naquele lugar denovo.";
        

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
        
        Escolha[] esc2parte = new Escolha[]{null};
        Capitulo Outrarodada = new Capitulo("outra rodada", Historia1B , Alister, entrada,esc2parte);
        Capitulo VarianteAlis = new Capitulo("Confronto",Historia1B,Alister,entrada,esc2parte);
        Escolha Um = new Escolha(Escolha1A, Outrarodada, 100);
        Escolha Dois = new Escolha(Escolha2A, Outrarodada,0 );
        Escolha Tres = new Escolha(Escolha3A, VarianteAlis,30);
        // Escolha Tres = new Escolha(Escolha3A, VarianteAlis,30);
        // Escolha Tres = new Escolha(Escolha3A, VarianteAlis,30);
        // Escolha Tres = new Escolha(Escolha3A, VarianteAlis,30);
        // Escolha Tres = new Escolha(Escolha3A, VarianteAlis,30);
        
        System.out.println("Digite o nome daquele que voce vai escolher?");
        String pers = entrada.nextLine();
        pers = pers.toLowerCase();
        if (pers.equals("alister")) {
            Escolha[] esc1parte = new Escolha[]{Um,Dois,Tres};
            Capitulo começo = new Capitulo("Novos horizontes",
                    Historia1A,
                    Alister,
                    entrada,
                    esc1parte);
            começo.imprima(entrada);
        }

        else if (pers.equals("hank")) {
            Capitulo começo = new Capitulo("Novos horizontes",
                    Historia2A,
                    Hank,
                    entrada,
                    null);
            começo.imprima(entrada);
        }

        entrada.close();
    }
}
