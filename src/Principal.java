public class Principal{
    public static void main(String[] args){
        System.out.println("Nesse jogo voce deverá escolher agentes antes de iniciar, tenha em mente que cada um deles \ntem sua própria história com seus pontos fortes e fracos.\n");
        Agente Alister = new Agente("Alister",
                                    1.90,
                                    40,
                                    "Investigação e informação");
        System.out.println("Agente 1: \n Nome: " + Alister.nome);
        System.out.println(" "+ Alister.altura + " m de altura");
        System.out.println(" "+Alister.idade +" anos de idade");
        System.out.println(" É especialista em " + Alister.especialidade);

        Agente Barney = new Agente("Barney",
                                    1.79,
                                    38,
                                    "Combate corpo a corpo e armado");
        System.out.println("\n\nAgente 2: \n Nome: " + Barney.nome);
        System.out.println(" "+ Barney.altura + " m de altura");
        System.out.println(" "+ Barney.idade +" anos de idade");
        System.out.println(" É especialista em " + Barney.especialidade);
        System.out.println(Condição.CalCond(100,0));

    }
}