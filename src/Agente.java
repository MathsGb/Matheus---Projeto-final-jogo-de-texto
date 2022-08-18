public class Agente {
    String nome;
    double altura;
    int idade;
    String especialidade;
    int estado;

    Agente(String nome, double altura, int idade, String especialidade, int estado) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.especialidade = especialidade;
        this.estado = estado;
        ;
    }

    static void imprima(Agente pessoa) {
        System.out.println("Agente -- \n Nome: " + pessoa.nome);
        System.out.println(" " + pessoa.altura + " m de altura");
        System.out.println(" " + pessoa.idade + " anos de idade");
        System.out.println(" É especialista em " + pessoa.especialidade);
    }

    void Calcond(int x) {
        this.estado = this.estado - x;
        if (estado <= 0) {
            System.out.println("O jogo acabou voce não tem mais forças para continuar a missão.");
        } else {
            System.out.println("Voce está com " + estado + "/100 de saúde e recebeu " + x + " de dano.");
        }
    }
}