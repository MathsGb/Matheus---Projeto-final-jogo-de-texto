public class Agente {
    String nome;
    double altura;
    int idade;
    String especialidade;

    Agente(String nome, double altura,int idade, String especialidade){
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.especialidade = especialidade;
    }

    static void imprima(Agente pessoa){
        System.out.println("Agente -- \n Nome: " + pessoa.nome);
        System.out.println(" "+pessoa.altura+" m de altura");
        System.out.println(" "+pessoa.idade+" anos de idade");
        System.out.println(" É especialista em " + pessoa.especialidade);
    }
}