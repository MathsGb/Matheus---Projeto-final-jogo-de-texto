import java.util.Scanner;
public class Principal{
    public static String Status(int x){
        if(x == -1){
            return "O jogo acabou voce não tem mais forças para continuar a missão.";
        }
        else{
            int y = 100 - x;
            String result = "Voce está com "+ Integer.toString(x) + "/100 de saúde e recebeu " + Integer.toString(y) +" de dano.";
        return result;
        }
    }
    
    public static int CalCond( int Atual,int Dano) {
        Atual = Atual - Dano;
        if( Atual <= 0 ){
            return -1;
        }
        return Atual ;
    }
    public static void main(String[] args){
        Scanner pausa = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);

        // Entrada e explicação
        System.out.println("Nesse jogo voce deverá escolher agentes antes de iniciar, tenha em mente que cada um deles tem sua própria história com seus pontos fortes e fracos.\n");
        System.out.print("Pressione Enter para continuar....\n");
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

        Agente Hank = new Agente("Hank",
                                    1.81,
                                    38,
                                    "Combate corpo a corpo e armado");
        System.out.println("\n\nAgente 2: \n Nome: " + Hank.nome);
        System.out.println(" "+ Hank.altura +" m de altura");
        System.out.println(" "+ Hank.idade +" anos de idade");
        System.out.println(" É especialista em " + Hank.especialidade);

        System.out.println("Digite o nome daquele que voce vai escolher?");
        String pers = entrada.nextLine();
        pers = pers.toLowerCase();
        if(pers.equals("alister")){
            int estado = 100;
            System.out.println(Capitulo.Historia1A);
            System.out.print("\nPressione Enter para continuar....\n");
            String pausa2 = pausa.nextLine();
            pausa2.equals("\n");
            System.out.println(Capitulo.Historia1B);
            System.out.print("\nPressione Enter para continuar....\n");
            String pausa3 = pausa.nextLine();
            pausa3.equals("\n");
            System.out.println(Capitulo.Historia1C);
            System.out.println("-Olhar o CORPO mais atentamente\n-Vanculhar a CASA \n-Procurar HANK\n");
            String per1 = entrada.nextLine();
            per1 = per1.toLowerCase();
            if(per1.equals("corpo") || per1.equals("casa")){
                if(per1.equals("corpo")){
                System.out.println(Capitulo.Escolha(1,0,0));
                System.out.println(Status(CalCond(estado,10)));
                System.out.print("\nPressione Enter para continuar....\n");
                String pausa4 = pausa.nextLine();
                pausa4.equals("\n");
            }
                else if(per1.equals("casa")){
                System.out.println(Capitulo.Escolha(0,1,0));
                System.out.print("\nPressione Enter para continuar....\n");
                String pausa4 = pausa.nextLine();
                pausa4.equals("\n");
            }
                System.out.println(Capitulo.Historia1D);
            }
            else{
                System.out.println(Capitulo.Escolha3A);
                System.out.println(Status(CalCond(estado,15)));

                //System.out.print("\nPressione Enter para continuar....\n");
                //String pausa4 = pausa.nextLine();
                //pausa4.equals("\n");
                System.out.println("\n                    Fim do Capitulo 1");
            }
        }
        else if(pers.equals("hank")) {
            System.out.println(Capitulo.Historia2A);
            System.out.print("\nPressione Enter para continuar....\n");
            String pausa2 = pausa.nextLine();
            pausa2.equals("\n");
            System.out.println(Capitulo.Historia2B);
        }
        entrada.close();
        pausa.close();
    }
}