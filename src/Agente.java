public class Agente {
    String nome;
    String especialidade;

    Agente(String nome ,String especialidade) {
        this.nome = nome;

        this.especialidade = especialidade;
    }
    
    static void imprima(Agente pessoa) {
        System.out.println("Agente -- \n Nome: " + pessoa.nome);
        System.out.println(" É especialista em " + pessoa.especialidade);
    }
}